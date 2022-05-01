package io.kenxue.pipeline.loader;

import io.kenxue.pipeline.annotation.Step;
import io.kenxue.pipeline.step.StepDefinition;
import org.reflections.Reflections;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class AnnotatedStepDefinitionLoader extends BaseStepDefinitionLoader {
    
    @Override
    public List<StepDefinition> reloadAll() {
        return doReloadAll();
    }

    @Override
    public StepDefinition reload(String name) {
        return doReload(name);
    }
    
    protected List<StepDefinition> doReloadAll() {
        List<StepDefinition> stepDefinitions = new LinkedList<>();
        for (Class<?> clazz : loadClass()) {
            StepDefinition stepDefinition = new StepDefinition();
            stepDefinition.setName(clazz.getName());

            stepDefinitions.add(stepDefinition);
        }
        return stepDefinitions;
    }
    
    protected StepDefinition doReload(String name) {
        StepDefinition stepDefinition = new StepDefinition();
        for (Class<?> clazz : loadClass()) {
            if (name.equals(clazz.getName())) {
                stepDefinition.setName(name);
                break;
            }
        }
        return stepDefinition;
    }

    public Set<Class<?>> loadClass(){
        Reflections reflections = new Reflections("io.kenxue.pipeline");
        Set<Class<?>> set = reflections.getTypesAnnotatedWith(Step.class);
        return set;
    }
}
