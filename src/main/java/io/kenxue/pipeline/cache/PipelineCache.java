package io.kenxue.pipeline.cache;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Pipeline实例缓存
 */
public class PipelineCache implements CacheI<Class<?>,Object>{

    private static ConcurrentHashMap<Class<?>,Object> cached = new ConcurrentHashMap<>(2<<4);

    @Override
    public Object get(Class<?> key) {
        return cached.get(key);
    }

    @Override
    public void set(Class<?> key, Object v) {
        cached.put(key,v);
    }
}
