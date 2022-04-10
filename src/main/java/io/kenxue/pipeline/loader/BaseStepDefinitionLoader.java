package io.kenxue.pipeline.loader;

import io.kenxue.pipeline.resolver.StepDefinition;
import io.kenxue.pipeline.resolver.StepDefinitionLoader;
import io.kenxue.pipeline.step.Step;

import java.util.List;

public class BaseStepDefinitionLoader implements StepDefinitionLoader {

    @Override
    public List<StepDefinition> reloadAll() {
        return null;
    }

    @Override
    public StepDefinition reload(String name) {
        return null;
    }

    protected List<StepDefinition> doReloadAll() {
        return null;
    }


    protected StepDefinition doReload(String name) {
        return null;
    }
}
