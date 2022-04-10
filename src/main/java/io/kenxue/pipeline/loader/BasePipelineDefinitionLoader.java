package io.kenxue.pipeline.loader;

import io.kenxue.pipeline.pipeline.PipelineDefinition;

import java.util.List;

public class BasePipelineDefinitionLoader implements PipelineDefinitionLoader {
    
    @Override
    public List<PipelineDefinition> reloadAll() {
        return null;
    }

    @Override
    public PipelineDefinition reload(String name) {
        return null;
    }
    
    protected List<PipelineDefinition> doReloadAll() {
        return null;
    }

    
    protected PipelineDefinition doReload(String name) {
        return null;
    }
}
