package hash;

import java.util.LinkedList;
import java.util.List;

public class PracHash<K,V> {

    private static final int DEFAULT_BUCKET_SIZE = 1024;
    private List<Node>[] buckets;
    private int size;
    private int bucketSize;

    public PracHash() {
        this.buckets = new List[DEFAULT_BUCKET_SIZE];
        this.bucketSize = DEFAULT_BUCKET_SIZE;
        this.size = 0;

        for (int i = 0; i < this.bucketSize; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public PracHash(int bucketSize) {
        this.buckets = new List[bucketSize];
        this.bucketSize = bucketSize;
        this.size = 0;

        for (int i = 0; i < bucketSize; i++) {
            this.buckets[i] = new LinkedList<>();
        }
    }

    private int hash(K key) {
        int hash = 0;
        for (Character ch : key.toString().toCharArray()) {
            hash += (int) ch;
        }
        return hash % this.bucketSize;
    }

    public void put(K key, V data) {
        int idx = hash(key);
        List<Node> bucket = this.buckets[idx];
        // 키 값이 같다면 바꿔주기
        for (Node node : bucket) {
            if (node.key.equals(key)) {
                node.data = data;
                return;
            }
        }
        // 키 값 없다면 삽입
        Node node = new Node(key, data);
        bucket.add(node);
        this.size++;

    }

    public V get(K key) {
        int idx = hash(key);
        for (Node node : buckets[idx]) {
            if (node.key.equals(key)) {
                return node.data;
            }
        }
        return null;
    }

    public boolean delete(K key) {
        int idx = this.hash(key);
        List<Node> bucket = this.buckets[idx];
        for (Node node : bucket) {
            if (node.key.equals(key)) {
                bucket.remove(node);
                this.size--;
                return true;
            }
        }
        return false;
    }

    public boolean contains(K key) {
        int idx = this.hash(key);
        List<Node> bucket = this.buckets[idx];
        for (Node node : bucket) {
            if (node.key.equals(key)) {
                return true;
            }
        }
        return false;
    }


    private class Node{
        K key;
        V data;

        Node(K key, V data) {
            this.key = key;
            this.data = data;
        }
    }

}
