package io.kenxue.pipeline.factory;

import io.kenxue.pipeline.phase.PhaseDesc;
import io.kenxue.pipeline.phase.PhaseManager;
import io.kenxue.pipeline.pipeline.DefaultPipeline;
import io.kenxue.pipeline.pipeline.Pipeline;
import io.kenxue.pipeline.pipeline.PipelineDefinition;
import io.kenxue.pipeline.pipeline.PipelineFactory;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class DefaultPipelineFactory extends PipelineFactory {

    @Resource
    private PhaseManager phaseManager;

    @Override
    public Pipeline create(PipelineDefinition pipelineDefinition) {
        DefaultPipeline pipeline = new DefaultPipeline();
        List<PhaseDesc> phases = pipelineDefinition.getPhases();
        if (Objects.nonNull(phases) && phases.size() > 0) {
            Collections.sort(phases, Comparator.comparingInt(a -> (a.getOrder() == null ? -1 : a.getOrder())));
            pipeline.setName(pipelineDefinition.getName());
            phases.forEach(v->{

            });
        }
        return pipeline;
    }
}
