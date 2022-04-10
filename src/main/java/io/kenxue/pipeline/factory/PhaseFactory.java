package io.kenxue.pipeline.factory;

import io.kenxue.pipeline.phase.Phase;
import io.kenxue.pipeline.phase.PhaseDefinition;

public interface PhaseFactory {
    Phase create(PhaseDefinition definition);
}
