package stack;

import org.w3c.dom.Node;

public class PracStack<T> {

    private int size;
    private Node head;

    public PracStack() {
        this.size = 0;
        this.head = new Node(null);
    }

    public void push(T data) {
        Node curr = new Node(data, this.head.next);
        this.head.next = curr;
        size++;
    }

    public T pop() {
        if (this.head.next == null) {
            return null;
        }
        Node curr = this.head.next;
        this.head.next = curr.next;
        curr.next = null;
        size--;

        return curr.data;
    }

    public T peek() {
        if (this.head.next == null) {
            return null;
        }
        return this.head.next.data;
    }

    public int size() {
        return this.size;
    }

    public T[] print() {
        T[] stack = (T[]) new Object[this.size];
        Node curr = this.head.next;
        for (int i = 0; i < this.size; i++) {
            stack[i] = curr.data;
            curr = curr.next;
        }

        return stack;
    }

    private class Node {
        T data;
        Node next;

        Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        Node(T data) {
            this.data = data;
        }

    }


}

