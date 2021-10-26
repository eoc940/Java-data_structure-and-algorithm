package list;

public class PracLinkedList<T> {

    private int size;
    private Node head;


    public PracLinkedList() {
        this.size = 0;
        this.head = new Node(null); // dummy node

    }

    public void add(T data) {
        Node curr = this.head;
        while (curr.next != null) {
            curr = curr.next;
        }
        Node node = new Node(data);
        curr.next = node;
        this.size++;
    }

    public void insert(int idx, T data) {
        if (idx > this.size || idx < 0) {
            throw new IndexOutOfBoundsException();
        }
        Node prev = this.head;
        Node curr = prev.next;
        int i = 0;
        while (i++ < idx) {
            prev = this.head.next;
            curr = prev.next;
        }
        Node node = new Node(data, curr);
        prev.next = node;
        this.size++;

    }

    public boolean delete(T data) {
        Node prev = this.head;
        Node curr = prev.next;
        while (curr != null) {
            if (curr.data.equals(data)) {
                this.size--;
                prev.next = curr.next;
                curr.next = null;
                return true;
            }
            prev = prev.next;
            curr = curr.next;
        }
        return false;
    }

    public boolean deleteByIndex(int idx) {
        if (idx > this.size || idx < 0) {
            throw new IndexOutOfBoundsException();
        }
        Node prev = this.head;
        Node curr = prev.next;

        int i = 0;
        while (i++ < idx) {
            prev = prev.next;
            curr = curr.next;
        }
        prev.next = curr.next;
        curr.next = null;
        this.size--;
        return true;

    }

    public boolean contains(T data) {
        Node curr = this.head.next;
        while (curr != null) {
            if (curr.data.equals(data)) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public int size() {
        return this.size;
    }

    public void clear() {
        this.head.next = null;
    }

    private class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
        }

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}

