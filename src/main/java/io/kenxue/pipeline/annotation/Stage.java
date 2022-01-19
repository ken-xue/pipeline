package io.kenxue.pipeline.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Stage {
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
     * 执行方式(缺省同步执行)
     */
    boolean parallel() default false;
    /**
     * 指定线程池
     * @return
     */
    String threadPool() default "";
    /**
     * 引用
     * @return
     */
    Class ref() default Void.class;
    /**
     * 描述
     * @return
     */
    String desc() default "";
}
