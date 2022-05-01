package io.kenxue.pipeline.annotation;

import io.kenxue.pipeline.resolver.ExecuteContext;

import javax.annotation.Resource;

@Phase(name = "JavaBuildPhase")
public class JavaBuildPhase {

    @Resource
    private JavaBuildStep javaBuildStep;
    @Resource
    private JavaPackageStep javaPackageStep;
    //省略其它step

    public void execute(ExecuteContext context){
        System.out.println("JavaBuildPhase");
    }

}