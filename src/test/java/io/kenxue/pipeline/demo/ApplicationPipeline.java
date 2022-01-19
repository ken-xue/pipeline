package io.kenxue.pipeline.demo;

import io.kenxue.pipeline.annotation.Pipeline;
import io.kenxue.pipeline.annotation.Stage;
import io.kenxue.pipeline.stage.RequireStage;

@Pipeline(name = "ApplicationPipeline")
public class ApplicationPipeline {

    @Stage(name = "需求分析阶段")
    private RequireStage requireStage;

//    @Stage(name = "技术分析阶段")
//
//    @Stage(name = "开发阶段")
//
//    @Stage(name = "提测阶段")
//
//    @Stage(name = "交付阶段")

}
