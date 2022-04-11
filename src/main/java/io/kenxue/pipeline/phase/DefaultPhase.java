package io.kenxue.pipeline.phase;

import io.kenxue.pipeline.resolver.ExecuteContext;
import io.kenxue.pipeline.resolver.Result;
import io.kenxue.pipeline.step.Step;

import java.util.List;

public class DefaultPhase extends BasePhase{

    @Override
    protected Result doExecute(ExecuteContext context) {
        return super.doExecute(context);
    }

    @Override
    public Result execute(ExecuteContext context) {
        boolean parallel = isParallel();
        List<Step> steps = stepManager.getSteps(this.steps);
        if (parallel){

        }else {
            steps.forEach(s->{
                Result execute = s.execute(context);
            });
        }
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
