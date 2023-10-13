package LRUCache.repositories.implementations;

import LRUCache.exceptions.CacheException;
import LRUCache.exceptions.InvalidKeyException;
import LRUCache.repositories.CacheRepository;

import java.util.LinkedHashMap;
import java.util.Map;

public class InMemoryCacheRepository<K, V> implements CacheRepository<K, V> {
    private LinkedHashMap<K, V> cache = null;

    public InMemoryCacheRepository(int size){
        cache = new LinkedHashMap<K, V>(size, 0.75f, true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return this.size() > size;
            }
        };
    }

    @Override
    public void add(K key, V value) {
        cache.put(key, value);
    }

    @Override
    public V get(K key) throws CacheException {
        if(cache.containsKey(key) == false)
            throw new InvalidKeyException(String.format("Key: %s is invalid", key));

        return cache.get(key);
    }
}