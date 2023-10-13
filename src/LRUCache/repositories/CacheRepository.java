package LRUCache.repositories;

import LRUCache.exceptions.CacheException;

public interface CacheRepository<K, V> {
    void add(K key, V value);
    V get(K key) throws CacheException;
}
