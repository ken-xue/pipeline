package io.kenxue.pipeline.factory;

import io.kenxue.pipeline.phase.PhaseDesc;
import io.kenxue.pipeline.phase.PhaseManager;
import io.kenxue.pipeline.pipeline.DefaultPipeline;
import io.kenxue.pipeline.pipeline.Pipeline;
import io.kenxue.pipeline.pipeline.PipelineDefinition;
import io.kenxue.pipeline.pipeline.PipelineFactory;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultPipelineFactory extends PipelineFactory {

    private PhaseManager phaseManager;

    @Override
    public Pipeline create(PipelineDefinition pipelineDefinition) {
        DefaultPipeline pipeline = new DefaultPipeline();
        List<PhaseDesc> phases = pipelineDefinition.getPhases();
        Collections.sort(phases, Comparator.comparingInt(PhaseDesc::getOrder));
        //phases.forEach(v->pipeline.set);
        return pipeline;
    }
}
