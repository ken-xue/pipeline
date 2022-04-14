package io.kenxue.pipeline.phase;

import io.kenxue.pipeline.step.StepDesc;
import lombok.Data;

import java.util.List;

@Data
public class PhaseDefinition {
    private String name;
    private boolean parallel;
    private long timeout;
    private int corePoolSize;
    private int maxPoolSize;
    private int queueSize;
    private List<StepDesc> steps;
}
