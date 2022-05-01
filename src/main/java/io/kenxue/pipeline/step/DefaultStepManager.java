package io.kenxue.pipeline.step;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 默认Step缓存
 */
public class DefaultStepManager implements StepManager {

    public Map<String, StepI> steps;

    @Override
    public List<StepI> getSteps(List<String> names) {
        List<StepI> ret = new LinkedList<>();
        names.forEach(name->ret.add(this.steps.get(name)));
        return ret;
    }

    @Override
    public StepI getStep(String name) {
        return steps.get(name);
    }

    @Override
    public void update(StepI stepI) {
        steps.put(stepI.getName(), stepI);
    }

    @Override
    public void add(StepI stepI) {
        steps.put(stepI.getName(), stepI);
    }

    @Override
    public void addAll(List<StepI> stepIS) {
        stepIS.forEach(s->this.steps.put(s.getName(),s));
    }

    @Override
    public StepI remove(String name) {
        return steps.remove(name);
    }

    @Override
    public List<StepI> removeAll(List<String> names) {
        List<StepI> ret = new LinkedList<>();
        names.forEach(name->ret.add(this.steps.remove(name)));
        return ret;
    }
}
