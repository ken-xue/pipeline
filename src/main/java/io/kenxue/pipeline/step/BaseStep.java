package io.kenxue.pipeline.step;

import io.kenxue.pipeline.resolver.ExecuteContext;
import io.kenxue.pipeline.resolver.Result;

public abstract class BaseStep implements StepI {

    public String name;

    protected Result doExecute(ExecuteContext context){
        // do some thing
        return null;
    }

    @Override
    public Result execute(ExecuteContext context) {
        return null;
    }
}
