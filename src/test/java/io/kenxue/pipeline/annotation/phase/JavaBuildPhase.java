package io.kenxue.pipeline.annotation.phase;

import io.kenxue.pipeline.annotation.Phase;
import io.kenxue.pipeline.annotation.step.JavaBuildStep;
import io.kenxue.pipeline.annotation.step.JavaPackageStep;
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