package io.kenxue.pipeline.phase;

import java.util.List;

public interface PhaseManager {
    List<Phase> getPhases(List<String> names);
    Phase getPhase(String name);
    void update(Phase phase);
    void add(Phase phase);
    void addAll(List<Phase> phases);
    Phase remove(String name);
    List<Phase> removeAll(List<String> names);
}
