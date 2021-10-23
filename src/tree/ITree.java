package tree;

public interface ITree<T> {
    void insert(T val);
    void delete(T val);
    boolean contains(T val);
    int size();

}
