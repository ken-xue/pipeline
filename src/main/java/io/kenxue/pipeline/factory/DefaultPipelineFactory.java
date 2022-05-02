package io.kenxue.pipeline.factory;

import io.kenxue.pipeline.phase.PhaseManager;
import io.kenxue.pipeline.pipeline.Pipeline;
import io.kenxue.pipeline.pipeline.PipelineDefinition;
import io.kenxue.pipeline.pipeline.PipelineFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class DefaultPipelineFactory extends PipelineFactory {

    @Resource
    private ApplicationContext ctx;

    @Resource
    private PhaseManager phaseManager;

    @Override
    public Pipeline create(PipelineDefinition pipelineDefinition) {
        Pipeline pipeline = (Pipeline) ctx.getBean(pipelineDefinition.getName());
        return pipeline;
    }
}
