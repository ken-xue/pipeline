package io.kenxue.pipeline.phase;

import java.util.List;
import java.util.Map;

public class DefaultPhaseManager implements PhaseManager{

    public Map<String,Phase> phases;

    @Override
    public List<Phase> getPhases(List<String> names) {
        return null;
    }

    @Override
    public Phase getPhase(String name) {
        return null;
    }

    @Override
    public void update(Phase phase) {

    }

    @Override
    public void add(Phase phase) {

    }

    @Override
    public void addAll(List<Phase> phases) {

    }

    @Override
    public void remove(String name) {

    }

    @Override
    public void removeAll(List<String> names) {

    }
}
