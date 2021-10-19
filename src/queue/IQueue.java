package queue;

public interface IQueue<T> {
    void offer(T data);
    T poll();
    T peek();
    int size();
    void clear();
    boolean isEmpty();
}
