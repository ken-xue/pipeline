package io.kenxue.pipeline.pipeline;

import io.kenxue.pipeline.phase.PhaseManager;
import io.kenxue.pipeline.resolver.ExecuteContext;
import io.kenxue.pipeline.resolver.Result;
import lombok.Data;

import java.util.List;
@Data
public class BasePipeline implements Pipeline {

    private String name;
    private List<String> phases;
    private PhaseManager phaseManager;

    public Result doExecute(ExecuteContext context){
        return null;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Result execute(ExecuteContext context) {
        return doExecute(context);
    }
}
