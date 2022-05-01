package io.kenxue.pipeline.factory;

import io.kenxue.pipeline.resolver.ExecuteContext;
import io.kenxue.pipeline.resolver.Result;
import io.kenxue.pipeline.step.StepDefinition;
import io.kenxue.pipeline.step.StepI;
import org.reflections.Reflections;

public class DefaultStepFactory implements StepFactory{

    @Override
    public StepI create(StepDefinition definition) {
        String stepName = definition.getName();

        Reflections reflections = new Reflections("io.kenxue.pipeline");

        StepI stepI = new StepI() {
            @Override
            public Result execute(ExecuteContext context) {
                return null;
            }

            @Override
            public String getName() {
                return stepName;
            }
        };
        return stepI;
    }
}
