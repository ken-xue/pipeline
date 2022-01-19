package io.kenxue.pipeline.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Meta
public @interface Pipeline {
    /**
     * 流程名称
     * @return
     */
    String name() default "";
    /**
     * 指定执行引擎
     * @return
     */
    String engine() default "";
    /**
     * 执行方式(缺省同步执行)
     */
    boolean parallel() default false;
    /**
     * 指定线程池
     * @return
     */
    String threadPool() default "";
}
