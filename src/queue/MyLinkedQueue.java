package queue;

public class MyLinkedQueue<T> implements IQueue<T>{

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedQueue() {
        this.head = new Node(null);
        this.tail = this.head;
        this.size = 0;
    }

    @Override
    public void offer(T data) {
        Node node = new Node(data);
        this.tail.next = node;
        this.tail = this.tail.next;
        this.size++;
    }

    @Override
    public T poll() {
        if (this.isEmpty()) {
            throw new IllegalStateException();
        }
        Node node = this.head.next;
        this.head.next = node.next;
        node.next = null;
        this.size--;
        if (this.head.next == null) {
            this.tail = this.head;
        }
        return node.data;
    }

    @Override
    public T peek() {
        if (this.isEmpty()) {
            throw new IllegalStateException();
        }
        return this.head.next.data;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void clear() {
        this.head.next = null;
        this.tail = this.head;
        this.size = 0;
    }

    @Override
    public boolean isEmpty() {
        return this.head.next == null;
    }

    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }

        Node(T data, Node next) {
            this.data = data;
            this.next = next;

        }
    }

}
