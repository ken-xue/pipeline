package io.kenxue.pipeline.step;

import io.kenxue.pipeline.resolver.ExecuteContext;
import io.kenxue.pipeline.resolver.Result;

public interface StepI {
    Result execute(ExecuteContext context);
    String getName();
}
