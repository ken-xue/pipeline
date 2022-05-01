package io.kenxue.pipeline.step;

import io.kenxue.pipeline.resolver.ExecuteContext;
import io.kenxue.pipeline.resolver.Result;
import io.kenxue.pipeline.step.Step;

public abstract class BaseStep implements Step {

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
