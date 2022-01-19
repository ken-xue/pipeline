package io.kenxue.pipeline.spring;

import io.kenxue.pipeline.annotation.Pipeline;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.stereotype.Component;

/**
 * 依赖spring进行解析bean
 */
//@Component
//public class PipelineBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
//
//    @Override
//    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
//        String[] beanDefinitionNames = registry.getBeanDefinitionNames();
//        for (String beanDefinitionName : beanDefinitionNames) {
//            BeanDefinition beanDefinition = registry.getBeanDefinition(beanDefinitionName);
//            System.out.println(beanDefinitionName+"|"+beanDefinition.getAttribute("key"));
//        }      //定义一个扫描器
//        ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(registry);
//        scanner.addIncludeFilter(new AnnotationTypeFilter(Pipeline.class));
//        scanner.scan("io.kenxue.pipeline");
//    }
//
//    @Override
//    public void postProcessBeanFactory(ConfigurableListableBeanFactory factory) throws BeansException {
//        System.out.println("PipelineBeanDefinitionRegistryPostProcessor的postProcessBeanFactory方法");
//        System.out.println(factory.getBeanDefinitionCount());
//    }
//}