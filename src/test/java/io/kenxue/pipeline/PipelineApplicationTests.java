package io.kenxue.pipeline;

import io.kenxue.pipeline.annotation.JavaAppPipeline;
import io.kenxue.pipeline.factory.PipelineResolverFactoryBean;
import io.kenxue.pipeline.pipeline.Pipeline;
import io.kenxue.pipeline.resolver.ExecuteContext;
import io.kenxue.pipeline.resolver.Result;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PipelineApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void appPipelineTest() {
        PipelineResolverFactoryBean pipelineResolverFactoryBean = new PipelineResolverFactoryBean();
        Pipeline pipeline = pipelineResolverFactoryBean.pipelineResolver.getPipeline(JavaAppPipeline.class.getName());
        ExecuteContext executeContext = new ExecuteContext();
        Result result = pipeline.execute(executeContext);
    }


}
