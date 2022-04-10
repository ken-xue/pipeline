package io.kenxue.pipeline.step;

import java.util.List;

public interface StepManager {
    List<Step> getSteps(List<String> names);
    Step getStep(String name);
    void update(Step Step);
    void add(Step Step);
    void addAll(List<Step> Steps);
    void remove(String name);
    void removeAll(List<String> names);
}
