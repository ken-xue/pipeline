package io.kenxue.pipeline.step;

import java.util.List;
import java.util.Map;

public class DefaultStepManager implements StepManager {

    public Map<String, Step> steps;

    @Override
    public List<Step> getSteps(List<String> names) {
        return null;
    }

    @Override
    public Step getStep(String name) {
        return null;
    }

    @Override
    public void update(Step Step) {

    }

    @Override
    public void add(Step Step) {

    }

    @Override
    public void addAll(List<Step> Steps) {

    }

    @Override
    public void remove(String name) {

    }

    @Override
    public void removeAll(List<String> names) {

    }
}
