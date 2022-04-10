package io.kenxue.pipeline.annotation;

public @interface Phase {
    String name() default "";
    boolean parallel() default false;
    long timeout() default 3000;
    int corePoolSize();
    int maxPoolSize();
    int queueSize();
}
