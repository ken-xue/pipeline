package io.kenxue.pipeline.annotation;

import io.kenxue.pipeline.annotation.phase.JavaBuildPhase;
import io.kenxue.pipeline.annotation.phase.JavaDeployPhase;

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
