package io.kenxue.pipeline.cache;

import io.kenxue.pipeline.pipeline.Pipeline;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Pipeline实例缓存
 */
public class PipelineCache implements CacheI<String, Pipeline>{

    private static ConcurrentHashMap<String, Pipeline> cached = new ConcurrentHashMap<>(2<<4);

    @Override
    public Pipeline get(String key) {
        return cached.get(key);
    }

    @Override
    public void set(String key, Pipeline v) {
        cached.put(key,v);
    }
}