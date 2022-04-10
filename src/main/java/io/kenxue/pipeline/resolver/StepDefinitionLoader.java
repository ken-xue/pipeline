package io.kenxue.pipeline.resolver;

import java.util.List;

public interface StepDefinitionLoader extends DefinitionLoader<StepDefinition> {
    @Override
    List<StepDefinition> reloadAll();

    @Override
    StepDefinition reload(String name);
}
