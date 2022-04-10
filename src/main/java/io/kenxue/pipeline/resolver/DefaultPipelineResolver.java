package io.kenxue.pipeline.resolver;

import io.kenxue.pipeline.loader.PhaseDefinitionLoader;
import io.kenxue.pipeline.loader.PipelineDefinitionLoader;
import io.kenxue.pipeline.pipeline.*;

import java.util.List;

public class DefaultPipelineResolver implements PipelineResolver {

    public List<PipelineDefinitionLoader> pipelineDefinitionLoaders;
    public List<PhaseDefinitionLoader> phaseDefinitionLoaders;
    public List<StepDefinitionLoader> stepDefinitionLoaders;
    public PipelineManager pipelineManager;
    public PipelineFactory pipelineFactory;

    public void init(){

    }

    @Override
    public Pipeline getPipeline(String name) {
        return null;
    }

    @Override
    public List<Pipeline> getAllPipelines() {
        return null;
    }

    @Override
    public Pipeline resolverPipeline(ExecuteContext context) {
        return null;
    }
}
