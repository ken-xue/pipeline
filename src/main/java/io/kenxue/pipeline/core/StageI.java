package io.kenxue.pipeline.core;

public interface StageI<C> {
    public void execute(C c);
}
