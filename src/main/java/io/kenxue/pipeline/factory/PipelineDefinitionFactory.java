package io.kenxue.pipeline.factory;

import io.kenxue.pipeline.annotation.Meta;
import io.kenxue.pipeline.annotation.Pipeline;
import io.kenxue.pipeline.annotation.Stage;
import io.kenxue.pipeline.annotation.Step;
import io.kenxue.pipeline.cache.PipelineCache;
import lombok.extern.slf4j.Slf4j;
import org.reflections.Reflections;

import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Slf4j
public class PipelineDefinitionFactory {

    private static Map<String,Class<?>> pipelineMap = new HashMap<>(2<<4);
    private static Map<String,Class<?>> stageMap = new HashMap<>(2<<4);
    private static Map<String,Class<?>> stepMap = new HashMap<>(2<<4);

    /**
     * 加载Pipeline相关类
     * @param basePackages
     */
    public void loader(String basePackages) {
        Reflections reflections = new Reflections(basePackages);
        Set<Class<?>> set = reflections.getTypesAnnotatedWith(Meta.class);
        for (Class<?> clazz : set) {
            if (clazz.isAnnotation()) continue;
            Annotation[] annotations = clazz.getAnnotations();
            for (Annotation annotation:annotations){
                Class<? extends Annotation> type = annotation.annotationType();
                if(type == Pipeline.class){
                    pipelineMap.put(clazz.getName(),clazz);
                    break;
                }else if (type == Stage.class){
                    stageMap.put(clazz.getName(),clazz);
                    break;
                }else if (type == Step.class){
                    stepMap.put(clazz.getName(),clazz);
                    break;
                }
            }
        }
        refresh();
    }

    /**
     * 实例化
     */
    public void refresh(){
        PipelineCache pipelineCache = new PipelineCache();
        pipelineMap.forEach((k,v)->{
            //instance pipeline
            try {
                Object o = v.newInstance();
                //set cached
                pipelineCache.set(v,o);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        });
    }
}
