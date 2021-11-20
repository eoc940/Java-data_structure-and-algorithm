package cache;


import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.Map;

public class LRUCache<K,V> implements ICache<K,V> {

    private int capacity;
    private Map<K, Node<K,V>> map;
    private Node<K, V> head;
    private Node<K, V> tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.head = Node.createDummy();
        this.tail = Node.createDummy();

        this.head.next = this.tail;
        this.tail.prev = this.head;
        this.head.prev = null;
        this.tail.next = null;

    }

    private void removeNode(Node<K, V> node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addToFirst(Node<K, V> node) {
        Node currentHead = this.head.next; // 현재 더블링크드리스트에서 가장 앞에 있는 노드
        currentHead.prev = node;
        node.next = currentHead;
        node.prev = this.head;
        this.head.next = node;
    }


    @Override
    public void put(K key, V value) {
        Node<K, V> node = this.map.get(key);
        if (node == null) {
            Node<K, V> tmp = new Node<>(key, value);
            if (this.map.size() == this.capacity) {
                this.delete(this.tail.prev.key);
            }
            this.addToFirst(tmp);
            this.map.put(key, tmp);
        } else {
            node.value = value;
            this.removeNode(node);
            this.addToFirst(node);
        }
    }

    @Override
    public V get(K key) {
        Node<K, V> node = this.map.get(key);
        if (node != null) {
            this.removeNode(node);
            this.addToFirst(node);
            return node.value;
        }
        return null;
    }

    @Override
    public boolean delete(K key) {
        Node<K, V> node = this.map.get(key);
        if (node != null) {
            this.removeNode(node);
            this.map.remove(key);
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return this.map.size();
    }

    private static class Node<K, V> {

        // 캐시의 키-밸류
        public K key;
        public V value;

        // double linked list
        Node<K,V> prev;
        Node<K,V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.prev = null;
            this.next = null;
        }

        static Node createDummy() {
            return new Node(null, null);
        }
    }

}
