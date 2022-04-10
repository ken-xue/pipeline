package io.kenxue.pipeline.pipeline;

import io.kenxue.pipeline.pipeline.Pipeline;

import java.util.List;

public interface PipelineManager {
    List<Pipeline> getPipelines(List<String> names);
    Pipeline getPipeline(String name);
    void update(Pipeline Pipeline);
    void add(Pipeline Pipeline);
    void addAll(List<Pipeline> pipelines);
    void remove(String name);
    void removeAll(List<String> names);
}
