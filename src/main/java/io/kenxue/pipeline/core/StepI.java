package io.kenxue.pipeline.core;

public interface StepI<C> {
    public void execute(C c);
}
