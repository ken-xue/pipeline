package io.kenxue.pipeline.pipeline;

import io.kenxue.pipeline.resolver.ExecuteContext;
import io.kenxue.pipeline.resolver.Result;

public interface Pipeline {
    String getName();
    Result execute(ExecuteContext context);
}
