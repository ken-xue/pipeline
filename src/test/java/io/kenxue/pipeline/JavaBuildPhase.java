package io.kenxue.pipeline;

import io.kenxue.pipeline.annotation.Phase;
import io.kenxue.pipeline.resolver.ExecuteContext;

import javax.annotation.Resource;

@Phase
public class JavaBuildPhase {

    @Resource
    private JavaBuildStep javaBuildStep;
    @Resource
    private JavaBuildPackageStep javaBuildPackageStep;
    //省略其它step

    public void execute(ExecuteContext context){

    }

}