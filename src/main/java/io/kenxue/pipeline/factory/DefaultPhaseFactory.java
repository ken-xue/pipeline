package io.kenxue.pipeline.factory;

import io.kenxue.pipeline.phase.Phase;
import io.kenxue.pipeline.phase.PhaseDefinition;
import io.kenxue.pipeline.step.StepManager;

public class DefaultPhaseFactory implements PhaseFactory {
    private StepManager stepManager;
    public Phase create(PhaseDefinition definition){
        return null;
    }
}
