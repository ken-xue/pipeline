package io.kenxue.pipeline.loader;

import io.kenxue.pipeline.annotation.Phase;
import io.kenxue.pipeline.phase.PhaseDefinition;
import org.reflections.Reflections;

import java.util.List;
import java.util.Set;

public class AnnotatedPhaseDefinitionLoader extends BasePhaseDefinitionLoader {
    
    @Override
    public List<PhaseDefinition> reloadAll() {
        return doReloadAll();
    }

    @Override
    public PhaseDefinition reload(String name) {
        return doReload(name);
    }
    
    protected List<PhaseDefinition> doReloadAll() {
        return null;
    }

    protected PhaseDefinition doReload(String name) {

        for (Class<?> clazz : loadClass()) {
            if (name.equals(clazz.getName())) {
                //拿到对应的注解
                Phase annotation = clazz.getAnnotation(Phase.class);

                PhaseDefinition phaseDefinition = new PhaseDefinition();
                phaseDefinition.setName(clazz.getName());

                return phaseDefinition;
            }
        }

        return null;
    }

    public Set<Class<?>> loadClass(){
        Reflections reflections = new Reflections("io.kenxue.pipeline");
        Set<Class<?>> set = reflections.getTypesAnnotatedWith(Phase.class);
        return set;
    }
}
