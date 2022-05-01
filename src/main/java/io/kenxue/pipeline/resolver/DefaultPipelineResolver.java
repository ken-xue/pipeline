package io.kenxue.pipeline.resolver;

import io.kenxue.pipeline.factory.DefaultPipelineFactory;
import io.kenxue.pipeline.loader.*;
import io.kenxue.pipeline.pipeline.*;

import java.util.*;

public class DefaultPipelineResolver implements PipelineResolver {

    private List<PipelineDefinitionLoader> pipelineDefinitionLoaders = new ArrayList<>(2 << 4);
    private List<PhaseDefinitionLoader> phaseDefinitionLoaders = new ArrayList<>(2 << 4);
    private List<StepDefinitionLoader> stepDefinitionLoaders = new ArrayList<>(2 << 4);
    private PipelineManager pipelineManager;
    private PipelineFactory pipelineFactory;

    public DefaultPipelineResolver initialize() {
        // SPI loading process loader
        ServiceLoader.load(PipelineDefinitionLoader.class).forEach(v->pipelineDefinitionLoaders.add(v));
        ServiceLoader.load(PhaseDefinitionLoader.class).forEach(v->phaseDefinitionLoaders.add(v));
        ServiceLoader.load(StepDefinitionLoader.class).forEach(v->stepDefinitionLoaders.add(v));

        pipelineManager = new DefaultPipelineManager();
        pipelineFactory = new DefaultPipelineFactory();
        return this;
    }

    @Override
    public Pipeline getPipeline(String name) {
        Pipeline pipeline = pipelineManager.getPipeline(name);
        if (Objects.nonNull(pipeline)) return pipeline;
        //If not, try to loading
        for (PipelineDefinitionLoader pipelineDefinitionLoader : pipelineDefinitionLoaders) {
            PipelineDefinition pipelineDefinition = pipelineDefinitionLoader.reload(name);
            if (Objects.nonNull(pipelineDefinition)) {
                pipeline = pipelineFactory.create(pipelineDefinition);
                pipelineManager.add(pipeline);
                break;
            }
        }
        return pipeline;
    }

    @Override
    public List<Pipeline> getAllPipelines() {
        List<Pipeline> pipelines = new ArrayList<>();
        for (PipelineDefinitionLoader pipelineDefinitionLoader : pipelineDefinitionLoaders) {
            List<PipelineDefinition> pipelineDefinitionList = pipelineDefinitionLoader.reloadAll();
            if (Objects.nonNull(pipelineDefinitionList)) {
                pipelineDefinitionList.forEach(pipelineDefinition -> {
                    Pipeline pipeline = pipelineFactory.create(pipelineDefinition);
                    pipelines.add(pipeline);
                    pipelineManager.add(pipeline);
                });
            }
        }
        return pipelines;
    }

    @Override
    public Pipeline resolverPipeline(ExecuteContext context) {

        Pipeline pipeline = getPipeline(context.getCommand().getPipelineName());

        return pipeline;
    }
}
