package io.kenxue.pipeline.annotation;

public @interface Phase {
    String name() default "";
    boolean parallel() default false;
    long timeout() default 3000;
    int corePoolSize() default 1;
    int maxPoolSize() default 1;
    int queueSize() default 100;
}
