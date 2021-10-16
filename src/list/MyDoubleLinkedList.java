package list;


import org.w3c.dom.Node;

public class MyDoubleLinkedList<T> implements IList<T> {

    private Node head;
    private Node tail;
    private int size;

    public MyDoubleLinkedList() {
        this.size = 0;
        this.head = new Node(null);
        this.tail = new Node(null);
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    @Override
    public void add(T t) {
        Node last = this.tail.prev;
        Node node = new Node(t, last, this.tail);
        last.next = node;
        this.tail.prev = node;
        this.size++;
    }

    @Override
    public void insert(int index, T t) {
        Node prev = null;
        Node curr = null;

        int i  = 0;
        if (index < this.size / 2) {
            prev = this.head;
            curr = this.head.next;

            while (i++ < index) {
                prev = prev.next;
                curr = curr.next;
            }

        } else {
            curr = this.tail;
            prev = this.tail.prev;
            while (i++ < (this.size - index)) {
                curr = curr.prev;
                prev = prev.prev;
            }

        }
        Node node = new Node(t, prev, curr);
        curr.prev = node;
        prev.next = node;
        this.size++;

    }

    @Override
    public void clear() {
        this.size = 0;
        this.head.next = tail;
        this.tail.prev = this.head;
    }

    @Override
    public boolean delete(T t) {
        return false;
    }

    @Override
    public boolean deleteByIndex(int index) {
        Node prev = null;
        Node curr = null;
        Node next = null;

        int i = 0;
        if (index < this.size / 2) {
            prev = this.head;
            curr = this.head.next;
            while (i++ < index) {
                prev = prev.next;
                curr = curr.next;
            }
            prev.next = curr.next;
            curr.next.prev = prev;
            curr.next = null;
            curr.prev = null;
        } else {
            // tail에서부터 역으로 찾아가는 경우
            curr = this.tail.prev;
            next = this.tail;
            while (i++ < (this.size - index - 1)) {
                next = next.prev;
                curr = curr.prev;
            }
            next.prev = curr.prev;
            curr.prev.next = next;
            curr.next = null;
            curr.prev = null;

        }
        this.size--;
        return false;
    }

    @Override
    public T get(int index) {
        if (index >= this.size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i = 0;
        Node curr = null;
        if (index < this.size / 2) { // index가 head에서 더 가까운 경우
            curr = this.head.next;
            while (i++ < index) {
                curr = curr.next;
            }
        } else { // index가 tail에서 더 가까운 경우
            curr = this.tail.prev;
            while (i++ < (this.size - index - 1)) {
                curr = curr.prev;
            }
        }
        return curr.data;
    }

    @Override
    public int indexOf(T t) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(T t) { //
        Node curr = this.head.next;
        while (curr != null) {
            if (curr.data != null & curr.data.equals(t)) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    @Override
    public int size() {
        return this.size;
    }

    private class Node {
        T data;
        Node next;
        Node prev;

        Node(T data) {
            this.data = data;
        }

        Node(T data, Node prev, Node next) {
            this.data = data;
            this.next = next;
            this.prev = prev;

        }
    }
}
