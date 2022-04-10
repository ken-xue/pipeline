package io.kenxue.pipeline.loader;

import io.kenxue.pipeline.step.StepDefinition;

import java.util.List;

public interface StepDefinitionLoader extends DefinitionLoader<StepDefinition> {
    @Override
    List<StepDefinition> reloadAll();

    @Override
    StepDefinition reload(String name);
}
