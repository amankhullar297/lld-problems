package LRUCache;

import LRUCache.repositories.CacheRepository;
import LRUCache.repositories.implementations.DoublyLinkedListCacheRepository;
import LRUCache.services.CacheService;
import LRUCache.services.implementations.LRUCacheService;

public class Main {
    public static void main(String[] args) throws Exception {
        CacheRepository<String, String> cacheRepository = new DoublyLinkedListCacheRepository<>(3);
        CacheService<String, String> cacheService = new LRUCacheService<>(cacheRepository);

        cacheService.add("a1", "c1");
        cacheService.add("a2", "c2");
        cacheService.add("a3", "c3");
        cacheService.add("a1", "c4");
        cacheService.add("a5", "c5");

        System.out.println(cacheService.get("a1"));
        //System.out.println(cacheService.get("a2"));
        System.out.println(cacheService.get("a3"));
    }
}
