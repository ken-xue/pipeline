package io.kenxue.pipeline.phase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultPhaseManager implements PhaseManager{

    public Map<String,Phase> phases = new HashMap<>(2<<4);

    @Override
    public List<Phase> getPhases(List<String> names) {
        List<Phase> ret = new ArrayList<>();
        names.forEach(name->ret.add(phases.get(name)));
        return ret;
    }

    @Override
    public Phase getPhase(String name) {
        return phases.get(name);
    }

    @Override
    public void update(Phase phase) {
        phases.put(phase.getName(),phase);
    }

    @Override
    public void add(Phase phase) {
        phases.put(phase.getName(),phase);
    }

    @Override
    public void addAll(List<Phase> phases) {
        phases.forEach(phase -> this.phases.put(phase.getName(),phase));
    }

    @Override
    public Phase remove(String name) {
        return phases.remove(name);
    }

    @Override
    public List<Phase> removeAll(List<String> names) {
        List<Phase> ret = new ArrayList<>();
        names.forEach(name->ret.add(phases.remove(name)));
        return ret;
    }
}
