package LRUCache.services;

import LRUCache.exceptions.CacheException;

public interface CacheService<K, V> {
    void add(K key, V value) throws CacheException;
    V get(K key) throws CacheException;
}
