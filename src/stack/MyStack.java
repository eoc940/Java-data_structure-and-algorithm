package stack;

public class MyStack<T> implements IStack<T>{

    private int size;
    private Node head;

    public MyStack() {
        this.size = size();
        this.head = new Node(null);
    }

    @Override
    public void push(T data) {
        Node node = new Node(data, this.head.next); // this.head.next는 null을 가리키므로
        // push된 node는 null을 가리키고 있다
        this.head.next = node;
        this.size++;
    }

    @Override
    public T pop() {
        if (this.isEmpty()) {
            return null;
        }
        Node curr = this.head.next;
        this.head.next = curr.next;
        curr.next = null;
        size--;
        return curr.data;
    }

    @Override
    public T peek() {
        if (this.isEmpty()) {
            return null;
        }
        return this.head.next.data;
    }

    @Override
    public int size() {
        return this.size;
    }

    private boolean isEmpty() {
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
