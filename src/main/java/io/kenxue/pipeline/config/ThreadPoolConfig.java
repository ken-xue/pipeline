package io.kenxue.pipeline.config;

/**
 * 缺省线程池大小
 */
public class ThreadPoolConfig {
    /**
     * 默认线程数：cpu核心数+1
     */
    public static final Integer DEFAULT_THREAD_NUMBER = Runtime.getRuntime().availableProcessors() + 1;



}
