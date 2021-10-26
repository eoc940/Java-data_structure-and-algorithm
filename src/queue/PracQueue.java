package queue;

import stack.PracStack;

public class PracQueue<T> {

    private int size;
    private Node head;
    private Node tail;

    public PracQueue() {
        this.size = 0;
        this.head = new Node(null);
        this.tail = this.head;
    }

    public void offer(T data) {
        Node node = new Node(data);

        this.tail.next = node;

        this.tail = this.tail.next;
        this.size++;
    }

    public T poll() {
        if (this.head.next == null) {
            throw new IllegalStateException();
        }
        Node node = this.head.next;
        this.head.next = node.next;
        node.next = null;
        this.size--;


        return node.data;
    }

    public T peek() {
        if (this.head.next == null) {
            throw new IllegalStateException();
        }
        Node node = this.head.next;
        return node.data;
    }

    public void clear() {
        this.head.next = null;
        this.tail = this.head;
        this.size = 0;
    }

    public T[] print() {
        T[] queue = (T[]) new Object[this.size];
        Node curr = this.head.next;
        for (int i = 0; i < this.size; i++) {
            queue[i] = curr.data;
            curr = curr.next;
        }

        return queue;
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

