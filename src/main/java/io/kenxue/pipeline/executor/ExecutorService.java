package io.kenxue.pipeline.executor;

import io.kenxue.pipeline.resolver.ExecuteContext;
import io.kenxue.pipeline.resolver.Result;

public interface ExecutorService {
    Result execute(ExecuteContext context);
}
