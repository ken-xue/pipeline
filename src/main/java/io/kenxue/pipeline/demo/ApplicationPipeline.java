package io.kenxue.pipeline.demo;

import io.kenxue.pipeline.annotation.Pipeline;
import io.kenxue.pipeline.annotation.Stage;
import io.kenxue.pipeline.demo.stage.*;

@Pipeline(name = "ApplicationPipeline")
public class ApplicationPipeline {

    @Stage(name = "需求分析阶段")
    private RequireStage requireStage;

    @Stage(name = "技术分析阶段")
    private TechniqueStage techniqueStage;

    @Stage(name = "开发阶段",parallel = true)
    private DevStage devStage;

    @Stage(name = "提测阶段",order = 10)
    private TestStage testStage;

    @Stage(name = "交付阶段")
    private DeliveryStage deliveryStage;

}
