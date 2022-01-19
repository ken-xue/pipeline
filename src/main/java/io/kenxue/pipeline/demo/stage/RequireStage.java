package io.kenxue.pipeline.demo.stage;

import io.kenxue.pipeline.annotation.Stage;
import io.kenxue.pipeline.annotation.Step;
import io.kenxue.pipeline.demo.step.RequirementsAnalysis;
import io.kenxue.pipeline.demo.step.RequirementsReview;

@Stage
public class RequireStage {
    @Step(name = "分析需求",order = 2)
    private RequirementsAnalysis requirementsAnalysis;
    @Step(name = "需求评审")
    private RequirementsReview requirementsReview;
}
