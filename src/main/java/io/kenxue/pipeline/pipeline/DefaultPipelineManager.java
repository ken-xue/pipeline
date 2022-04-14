package io.kenxue.pipeline.pipeline;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DefaultPipelineManager implements PipelineManager {

    private Map<String,Pipeline> pipelines = new HashMap<>(2<<4);

    @Override
    public List<Pipeline> getPipelines(List<String> names) {
        List<Pipeline> ret = new LinkedList<>();
        names.forEach(name->ret.add(pipelines.get(name)));
        return ret;
    }

    @Override
    public Pipeline getPipeline(String name) {
        return pipelines.get(name);
    }

    @Override
    public void update(Pipeline pipeline) {
        pipelines.put(pipeline.getName(),pipeline);
    }

    @Override
    public void add(Pipeline pipeline) {
        pipelines.put(pipeline.getName(),pipeline);
    }

    @Override
    public void addAll(List<Pipeline> pipelines) {
        pipelines.forEach(p->this.pipelines.put(p.getName(),p));
    }

    @Override
    public Pipeline remove(String name) {
        return pipelines.remove(name);
    }

    @Override
    public List<Pipeline> removeAll(List<String> names) {
        List<Pipeline> ret = new LinkedList<>();
        names.forEach(name->ret.add(pipelines.remove(name)));
        return ret;
    }
}
