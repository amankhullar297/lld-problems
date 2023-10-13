package LRUCache.repositories.implementations;

import LRUCache.exceptions.CacheException;
import LRUCache.exceptions.InvalidKeyException;
import LRUCache.models.Node;
import LRUCache.repositories.CacheRepository;

import java.util.HashMap;

public class DoublyLinkedListCacheRepository<K, V> implements CacheRepository<K, V> {
    private HashMap<K, Node<K, V>> map;
    private int capacity, count;
    private Node<K, V> head, tail;

    public DoublyLinkedListCacheRepository(int size){
        this.capacity = size;
        map = new HashMap<>();
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
        head.prev = null;
        tail.next = null;
        count = 0;
    }

    @Override
    public void add(K key, V value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            deleteNode(node);
            addToHead(node);
        }
        else {
            Node node = new Node(key, value);
            map.put(key, node);
            if (count < capacity) {
                count++;
                addToHead(node);
            }
            else {
                map.remove(tail.prev.key);
                deleteNode(tail.prev);
                addToHead(node);
            }
        }
    }

    @Override
    public V get(K key) throws CacheException {
        if (map.containsKey(key)) {
            Node<K, V> node = map.get(key);
            V result = node.value;
            deleteNode(node);
            addToHead(node);

            return result;
        }

        throw new InvalidKeyException(String.format("Key: %s is invalid", key));
    }

    private void deleteNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addToHead(Node node) {
        node.next = head.next;
        node.next.prev = node;
        node.prev = head;
        head.next = node;
    }
}
