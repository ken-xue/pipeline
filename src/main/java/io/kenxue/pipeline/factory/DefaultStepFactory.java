package io.kenxue.pipeline.factory;

import io.kenxue.pipeline.step.StepDefinition;
import io.kenxue.pipeline.step.StepI;

public class DefaultStepFactory implements StepFactory{
    /**
     * create a step instance by definition
     * @param definition
     * @return a step instance
     */
    @Override
    public StepI create(StepDefinition definition) {
        String stepName = definition.getName();
        StepI stepI = null;
        try {
            Class<?> clazz = Class.forName(stepName);
            stepI = (StepI) clazz.newInstance();

        }catch (Exception e){
            e.printStackTrace();
        }

        return stepI;
    }
}
