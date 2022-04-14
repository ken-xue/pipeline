package io.kenxue.pipeline.pipeline;

import io.kenxue.pipeline.phase.PhaseDesc;
import lombok.Data;

import java.util.List;
@Data
public class PipelineDefinition {
    private String name;
    List<PhaseDesc> phases;
}
