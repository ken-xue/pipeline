package io.kenxue.pipeline.phase;

import io.kenxue.pipeline.resolver.ExecuteContext;
import io.kenxue.pipeline.resolver.Result;

public class DefaultPhase extends BasePhase{

    @Override
    public Result execute(ExecuteContext context) {
        return null;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean isParallel() {
        return false;
    }
}
