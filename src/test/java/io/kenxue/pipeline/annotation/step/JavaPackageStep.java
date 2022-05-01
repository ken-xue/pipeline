package io.kenxue.pipeline.annotation.step;

import io.kenxue.pipeline.annotation.Step;
import io.kenxue.pipeline.resolver.DefaultResult;
import io.kenxue.pipeline.resolver.ExecuteContext;
import io.kenxue.pipeline.resolver.Result;
import io.kenxue.pipeline.step.StepI;

@Step(name = "JavaBuildPackageStep")
public class JavaPackageStep implements StepI {

    public Result execute(ExecuteContext context){
        System.out.println("JavaBuildPackageStep");
        System.out.println("do some thing");
        Result result = new DefaultResult();
        result.add(getName(),getName());
        return result;
    }

    @Override
    public String getName() {
        return "JavaBuildPackageStep";
    }

}