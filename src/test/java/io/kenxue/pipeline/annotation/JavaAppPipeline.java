package io.kenxue.pipeline.annotation;

import javax.annotation.Resource;

@Pipeline("Java应用流水线")
public class JavaAppPipeline {

    @Resource
    private JavaBuildPhase javaBuildPhase;

    @Resource
    private JavaDeployPhase javaDeployPhase;
}
