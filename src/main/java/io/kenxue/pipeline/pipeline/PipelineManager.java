package io.kenxue.pipeline.pipeline;

import java.util.List;

/**
 * pipeline缓存
 */
public interface PipelineManager {
    List<Pipeline> getPipelines(List<String> names);
    Pipeline getPipeline(String name);
    void update(Pipeline pipeline);
    void add(Pipeline pipeline);
    void addAll(List<Pipeline> pipelines);
    Pipeline remove(String name);
    List<Pipeline> removeAll(List<String> names);
}
