package io.kenxue.pipeline.loader;

import io.kenxue.pipeline.pipeline.PipelineDefinition;

import java.util.List;

/**
 * mysql加载pipeline加载器
 */
public class MysqlPipelineDefinitionLoader extends BasePipelineDefinitionLoader{

    @Override
    public List<PipelineDefinition> reloadAll() {
        return super.reloadAll();
    }

    @Override
    public PipelineDefinition reload(String name) {
        return super.reload(name);
    }

    @Override
    protected List<PipelineDefinition> doReloadAll() {
        return super.doReloadAll();
    }

    @Override
    protected PipelineDefinition doReload(String name) {
        return super.doReload(name);
    }
}
