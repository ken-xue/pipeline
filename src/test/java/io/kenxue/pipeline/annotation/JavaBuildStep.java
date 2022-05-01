package io.kenxue.pipeline.annotation;

import io.kenxue.pipeline.resolver.ExecuteContext;

@Step(name = "JavaBuildStep")
public class JavaBuildStep {

    public void execute(ExecuteContext context){
        System.out.println("JavaBuildStep");
    }
}