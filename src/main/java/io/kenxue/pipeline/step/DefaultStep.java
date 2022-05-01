package io.kenxue.pipeline.step;

import io.kenxue.pipeline.resolver.ExecuteContext;
import io.kenxue.pipeline.resolver.Result;

public class DefaultStep extends BaseStep {

    @Override
    public String getName() {
        return "DefaultStep";
    }

    @Override
    protected Result doExecute(ExecuteContext context) {
        // to do something
        return super.doExecute(context);
    }
}
