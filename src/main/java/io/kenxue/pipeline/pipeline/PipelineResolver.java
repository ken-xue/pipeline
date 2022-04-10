package io.kenxue.pipeline.pipeline;

import io.kenxue.pipeline.pipeline.Pipeline;
import io.kenxue.pipeline.resolver.ExecuteContext;

import java.util.List;

public interface PipelineResolver {
    Pipeline getPipeline(String name);
    List<Pipeline> getAllPipelines();
    Pipeline resolverPipeline(ExecuteContext context);
}
