package io.kenxue.pipeline.factory;

import io.kenxue.pipeline.phase.PhaseManager;
import io.kenxue.pipeline.pipeline.Pipeline;
import io.kenxue.pipeline.pipeline.PipelineDefinition;
import io.kenxue.pipeline.pipeline.PipelineFactory;

public class DefaultPipelineFactory extends PipelineFactory {

    private PhaseManager phaseManager;

    @Override
    public Pipeline create(PipelineDefinition pipelineDefinition) {
        return null;
    }
}
