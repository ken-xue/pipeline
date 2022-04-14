package io.kenxue.pipeline.pipeline;

import io.kenxue.pipeline.resolver.ExecuteContext;
import io.kenxue.pipeline.resolver.Result;

import java.util.List;

public class DefaultPipeline extends BasePipeline {
    @Override
    public Result doExecute(ExecuteContext context) {
        List<String> phases = getPhases();
        return super.doExecute(context);
    }
}
