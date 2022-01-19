package io.kenxue.pipeline.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface  Step {

    /**
     * name
     * @return
     */
    String name() default "";
    /**
     * 执行优先级
     * @return
     */
    int order() default 0;
    /**
     * 是否并行执行
     * @return
     */
    boolean parallel() default false;
    /**
     * 指定线程池
     * @return
     */
    String threadPool() default "";
}
