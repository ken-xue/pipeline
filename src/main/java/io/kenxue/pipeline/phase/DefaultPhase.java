package io.kenxue.pipeline.phase;

import io.kenxue.pipeline.resolver.ExecuteContext;
import io.kenxue.pipeline.resolver.Result;

public class DefaultPhase extends BasePhase{

    @Override
    protected Result doExecute(ExecuteContext context) {
        return super.doExecute(context);
    }

    @Override
    public Result execute(ExecuteContext context) {
        return this.doExecute(context);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean isParallel() {
        return this.isParallel;
    }
}
