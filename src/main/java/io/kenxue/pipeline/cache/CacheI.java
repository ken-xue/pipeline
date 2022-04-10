package io.kenxue.pipeline.cache;
/**
 * 统一缓存抽象接口
 * @param <K>
 * @param <V>
 */
public interface CacheI<K,V> {
    V get(K key);
    void set(K key,V v);
}
