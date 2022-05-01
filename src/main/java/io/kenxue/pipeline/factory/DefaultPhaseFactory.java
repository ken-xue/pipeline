package io.kenxue.pipeline.factory;

import io.kenxue.pipeline.phase.DefaultPhase;
import io.kenxue.pipeline.phase.Phase;
import io.kenxue.pipeline.phase.PhaseDefinition;
import io.kenxue.pipeline.step.StepI;
import io.kenxue.pipeline.step.StepManager;

public class DefaultPhaseFactory implements PhaseFactory {

    private StepManager stepManager;

    public Phase create(PhaseDefinition definition) {
        DefaultPhase defaultPhase = new DefaultPhase();
        definition.getSteps().forEach(stepDesc -> {
            StepI stepI = stepManager.getStep(stepDesc.getName());
        });
        return defaultPhase;
    }
}
