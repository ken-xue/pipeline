package io.kenxue.pipeline.step;

import java.util.List;

public interface StepManager {
    List<StepI> getSteps(List<String> names);
    StepI getStep(String name);
    void update(StepI stepI);
    void add(StepI stepI);
    void addAll(List<StepI> stepIS);
    StepI remove(String name);
    List<StepI> removeAll(List<String> names);
}
