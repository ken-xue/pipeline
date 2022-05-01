package io.kenxue.pipeline.annotation.step;

import io.kenxue.pipeline.annotation.Step;
import io.kenxue.pipeline.resolver.ExecuteContext;

@Step(name = "JavaBuildPackageStep")
public class JavaPackageStep {

    public void execute(ExecuteContext context){
        System.out.println("JavaBuildPackageStep");
    }

}