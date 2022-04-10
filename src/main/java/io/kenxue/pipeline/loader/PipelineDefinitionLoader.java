package io.kenxue.pipeline.loader;

import io.kenxue.pipeline.pipeline.PipelineDefinition;

import java.util.List;

public interface PipelineDefinitionLoader  extends DefinitionLoader<PipelineDefinition> {
    List<PipelineDefinition> reloadAll();
    PipelineDefinition reload(String name);
}
