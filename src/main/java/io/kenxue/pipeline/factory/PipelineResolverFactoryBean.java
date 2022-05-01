package io.kenxue.pipeline.factory;

import io.kenxue.pipeline.resolver.DefaultPipelineResolver;
import io.kenxue.pipeline.resolver.PipelineResolver;
import lombok.Data;

import java.util.Objects;

@Data
public class PipelineResolverFactoryBean {

    private PipelineResolver pipelineResolver;

    public PipelineResolver getDefaultPipelineResolver(){
        if (Objects.isNull(pipelineResolver))
        pipelineResolver = new DefaultPipelineResolver().initialize();
        return pipelineResolver;
    }
}
