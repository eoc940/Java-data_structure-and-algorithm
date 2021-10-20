package hash;

public interface IHashTable<K,V> {
    void put(K key, V value);
    V get(K key);
    boolean delete(K key);
    boolean contains(K key);
    int size();
}
