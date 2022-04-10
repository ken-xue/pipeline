package io.kenxue.pipeline.phase;

import java.util.List;

public class PhaseDefinition {
    private String name;
    private boolean parallel;
    private long timeout;
    private int corePoolSize;
    private int maxPoolSize;
    private int queueSize;
    private List<StepDesc> steps;
}
