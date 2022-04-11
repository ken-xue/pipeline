package io.kenxue.pipeline.phase;

import io.kenxue.pipeline.resolver.ExecuteContext;
import io.kenxue.pipeline.executor.ExecutorService;
import io.kenxue.pipeline.resolver.Result;
import io.kenxue.pipeline.step.StepManager;

import java.util.List;

public abstract class BasePhase implements  Phase{

    protected String name;
    protected List<String> steps;
    protected boolean isParallel;
    protected ExecutorService executor;
    protected StepManager stepManager;

    protected Result doExecute(ExecuteContext context){
        return executor.execute(context);
    }

}
