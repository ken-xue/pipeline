package io.kenxue.pipeline.factory;

import io.kenxue.pipeline.resolver.StepDefinition;
import io.kenxue.pipeline.step.Step;

public interface StepFactory {
    Step create(StepDefinition definition);
}
