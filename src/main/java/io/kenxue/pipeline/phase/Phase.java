package io.kenxue.pipeline.phase;

import io.kenxue.pipeline.resolver.ExecuteContext;
import io.kenxue.pipeline.resolver.Result;

public interface Phase {
    Result execute(ExecuteContext context);
    String getName();
    boolean isParallel();
}
