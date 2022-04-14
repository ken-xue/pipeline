package io.kenxue.pipeline.step;

import java.util.List;

public interface StepManager {
    List<Step> getSteps(List<String> names);
    Step getStep(String name);
    void update(Step step);
    void add(Step step);
    void addAll(List<Step> steps);
    Step remove(String name);
    List<Step> removeAll(List<String> names);
}
