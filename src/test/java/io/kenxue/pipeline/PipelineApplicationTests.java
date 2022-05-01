package io.kenxue.pipeline;

import io.kenxue.pipeline.annotation.JavaAppPipeline;
import io.kenxue.pipeline.factory.PipelineResolverFactoryBean;
import io.kenxue.pipeline.pipeline.Pipeline;
import io.kenxue.pipeline.resolver.ExecuteContext;
import io.kenxue.pipeline.resolver.Result;
import org.junit.Test;

class PipelineApplicationTests {

    @Test
    public void appPipelineTest() {
        PipelineResolverFactoryBean pipelineResolverFactoryBean = new PipelineResolverFactoryBean();
        ExecuteContext executeContext = new ExecuteContext();
        executeContext.setCommand(() -> JavaAppPipeline.class.getName());
        System.out.println(executeContext.getCommand().getPipelineName());
        Pipeline pipeline = pipelineResolverFactoryBean.getDefaultPipelineResolver().resolverPipeline(executeContext);
        Result result = pipeline.execute(executeContext);
        System.out.println(result.getAll());
        System.out.println(result);
    }


}
