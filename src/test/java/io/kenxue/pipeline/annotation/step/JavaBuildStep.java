package io.kenxue.pipeline.annotation.step;

import io.kenxue.pipeline.annotation.Step;
import io.kenxue.pipeline.resolver.ExecuteContext;

@Step(name = "JavaBuildStep")
public class JavaBuildStep {

    public void execute(ExecuteContext context){
        System.out.println("JavaBuildStep");
    }
}