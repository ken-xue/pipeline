package io.kenxue.pipeline.pipeline;

public abstract class PipelineFactory {
    public abstract Pipeline create(PipelineDefinition pipelineDefinition);
}
