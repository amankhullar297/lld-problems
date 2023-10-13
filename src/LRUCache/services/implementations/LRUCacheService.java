package LRUCache.services.implementations;

import LRUCache.exceptions.CacheException;
import LRUCache.exceptions.InvalidKeyException;
import LRUCache.repositories.CacheRepository;
import LRUCache.services.CacheService;

import java.util.Objects;

public class LRUCacheService<K, V> implements CacheService<K, V> {
    private CacheRepository<K, V> cacheRepository;

    public LRUCacheService(CacheRepository<K, V> cacheRepository){
        this.cacheRepository = cacheRepository;
    }

    @Override
    public void add(K key, V value) throws CacheException {
        if(Objects.isNull(key))
            throw new InvalidKeyException("Key cannot be null");

        cacheRepository.add(key, value);
    }

    @Override
    public V get(K key) throws CacheException {
        if(Objects.isNull(key))
            throw new InvalidKeyException("Key cannot be null");

        return cacheRepository.get(key);
    }
}
