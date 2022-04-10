package io.kenxue.pipeline.pipeline;

import io.kenxue.pipeline.cache.PipelineCache;

import java.util.List;

public class DefaultPipelineManager implements PipelineManager {

    private PipelineCache pipelineCache;

    @Override
    public List<Pipeline> getPipelines(List<String> names) {
        return null;
    }

    @Override
    public Pipeline getPipeline(String name) {
        return pipelineCache.get(name);
    }

    @Override
    public void update(Pipeline Pipeline) {

    }

    @Override
    public void add(Pipeline Pipeline) {

    }

    @Override
    public void addAll(List<Pipeline> pipelines) {

    }

    @Override
    public void remove(String name) {

    }

    @Override
    public void removeAll(List<String> names) {

    }
}
