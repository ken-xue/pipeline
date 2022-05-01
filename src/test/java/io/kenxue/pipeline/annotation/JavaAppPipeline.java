package io.kenxue.pipeline.annotation;

import javax.annotation.Resource;

@Pipeline("Java应用流水线")
public class JavaAppPipeline {

    /**
     * 构建阶段
     */
    @Resource
    private JavaBuildPhase javaBuildPhase;

    /**
     * 部署阶段
     */
    @Resource
    private JavaDeployPhase javaDeployPhase;

}
