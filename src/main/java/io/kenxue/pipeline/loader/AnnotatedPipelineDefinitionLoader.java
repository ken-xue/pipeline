package io.kenxue.pipeline.loader;

import io.kenxue.pipeline.annotation.Pipeline;
import io.kenxue.pipeline.annotation.Step;
import io.kenxue.pipeline.phase.PhaseDesc;
import io.kenxue.pipeline.pipeline.PipelineDefinition;
import org.reflections.Reflections;

import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class AnnotatedPipelineDefinitionLoader extends BasePipelineDefinitionLoader{

    @Override
    public List<PipelineDefinition> reloadAll() {
        return doReloadAll();
    }

    @Override
    public PipelineDefinition reload(String name) {
        return doReload(name);
    }

    @Override
    protected List<PipelineDefinition> doReloadAll() {
        List<PipelineDefinition> pipelineDefinitions = new LinkedList<>();
        return pipelineDefinitions;
    }

    @Override
    protected PipelineDefinition doReload(String name) {
        PipelineDefinition pipelineDefinition = new PipelineDefinition();
        for (Class<?> clazz:loadClass()){
            if (name.equals(clazz.getName())){
                pipelineDefinition.setName(name);
                Field[] fields = clazz.getFields();
                List<PhaseDesc> phaseDescList = new LinkedList<>();
                for (Field f : fields) {
                        PhaseDesc phaseDesc = new PhaseDesc();
                        phaseDesc.setName(f.getName());
                        phaseDescList.add(phaseDesc);
                }
                pipelineDefinition.setPhases(phaseDescList);
                break;
            }
        }
        return pipelineDefinition;
    }

    public Set<Class<?>> loadClass(){
        Reflections reflections = new Reflections("io.kenxue.pipeline");
        Set<Class<?>> set = reflections.getTypesAnnotatedWith(Pipeline.class);
        return set;
    }
}
