package io.kenxue.pipeline.loader;

import io.kenxue.pipeline.pipeline.PipelineDefinition;

import java.util.LinkedList;
import java.util.List;

public class AnnotatedPipelineDefinitionLoader extends BasePipelineDefinitionLoader{

    @Override
    public List<PipelineDefinition> reloadAll() {
        return doReloadAll();
    }

    @Override
    public PipelineDefinition reload(String name) {
        return doReload(name);
    }

    @Override
    protected List<PipelineDefinition> doReloadAll() {
        List<PipelineDefinition> pipelineDefinitions = new LinkedList<>();
        return pipelineDefinitions;
    }

    @Override
    protected PipelineDefinition doReload(String name) {
        PipelineDefinition pipelineDefinition = new PipelineDefinition();
        pipelineDefinition.setName(name);
        return pipelineDefinition;
    }
}
