package io.kenxue.pipeline.step;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 默认Step缓存
 */
public class DefaultStepManager implements StepManager {

    public Map<String, Step> steps;

    @Override
    public List<Step> getSteps(List<String> names) {
        List<Step> ret = new LinkedList<>();
        names.forEach(name->ret.add(this.steps.get(name)));
        return ret;
    }

    @Override
    public Step getStep(String name) {
        return steps.get(name);
    }

    @Override
    public void update(Step step) {
        steps.put(step.getName(),step);
    }

    @Override
    public void add(Step step) {
        steps.put(step.getName(),step);
    }

    @Override
    public void addAll(List<Step> steps) {
        steps.forEach(s->this.steps.put(s.getName(),s));
    }

    @Override
    public Step remove(String name) {
        return steps.remove(name);
    }

    @Override
    public List<Step> removeAll(List<String> names) {
        List<Step> ret = new LinkedList<>();
        names.forEach(name->ret.add(this.steps.remove(name)));
        return ret;
    }
}
