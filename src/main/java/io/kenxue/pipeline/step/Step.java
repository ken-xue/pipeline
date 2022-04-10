package io.kenxue.pipeline.step;

import io.kenxue.pipeline.resolver.ExecuteContext;
import io.kenxue.pipeline.resolver.Result;

public interface Step {
    Result execute(ExecuteContext context);
    String getName();
}
