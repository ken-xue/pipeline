package io.kenxue.pipeline.demo.step;

import io.kenxue.pipeline.annotation.Step;
import io.kenxue.pipeline.core.StepI;
import io.kenxue.pipeline.demo.context.ApplicationContext;
import lombok.extern.slf4j.Slf4j;

@Step
@Slf4j
public class RequirementsAnalysis implements StepI<ApplicationContext> {
    @Override
    public void execute(ApplicationContext applicationContext) {
        log.info("execute step:{},context info:{}",this.getClass().getName(),applicationContext);
    }
}
