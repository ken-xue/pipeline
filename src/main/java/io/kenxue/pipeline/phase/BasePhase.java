package io.kenxue.pipeline.phase;

import io.kenxue.pipeline.resolver.DefaultResult;
import io.kenxue.pipeline.resolver.ExecuteContext;
import io.kenxue.pipeline.executor.ExecutorService;
import io.kenxue.pipeline.resolver.Result;
import io.kenxue.pipeline.step.StepI;
import io.kenxue.pipeline.step.StepManager;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public abstract class BasePhase implements Phase {

    protected String name;
    protected List<String> steps;
    protected boolean isParallel;
    protected ExecutorService executor;
    protected StepManager stepManager;

    protected Result doExecute(ExecuteContext context) {
        Result result = new DefaultResult();
        List<StepI> stepIS = stepManager.getSteps(this.steps);
        //Parallel execution
        if (isParallel()){
            List<FutureTask> futureTasks = new LinkedList<>();
            stepIS.forEach(s-> {
                FutureTask futureTask = new FutureTask(() -> s.execute(context));
                executor.execute(futureTask);
                futureTasks.add(futureTask);
            });
            for (int i = 0; i < futureTasks.size(); i++) {
                FutureTask futureTask = futureTasks.get(i);
                try {
                    result.add(stepIS.get(i).getName(),futureTask.get());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }
        }
        //Serial execution
        else {
            stepIS.forEach(s->{
                Result execute = s.execute(context);
                result.add(s.getName(),execute);
            });
        }
        return result;
    }

    @Override
    public Result execute(ExecuteContext context) {
        return doExecute(context);
    }
}
