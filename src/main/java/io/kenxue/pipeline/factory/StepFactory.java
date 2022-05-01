package io.kenxue.pipeline.factory;

import io.kenxue.pipeline.step.StepDefinition;
import io.kenxue.pipeline.step.StepI;

public interface StepFactory {
    StepI create(StepDefinition definition);
}
