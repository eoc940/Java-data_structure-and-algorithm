package queue;

import org.w3c.dom.Node;

public class MyCircularQueue<T> implements IQueue<T>{

    private T[] elements;
    private int front;
    private int rear;
    private int maxSize;

    public MyCircularQueue(int size) {
        // isempty, isfull을 구분하기 위해 dummy공간 하나 추가
        this.elements = (T[]) new Object[size + 1];
        this.front = 0;
        this.rear = 0;
        this.maxSize = size + 1;
    }

    @Override
    public void offer(T data) {
        if (this.isFull()) {
            throw new IllegalStateException();
        }
        this.rear = (this.rear + 1) % this.maxSize;
        this.elements[this.rear] = data;
    }

    @Override
    public T poll() {
        if (this.isEmpty()) {
            throw new IllegalStateException();
        }
        this.front = (this.front + 1) % this.maxSize;
        return this.elements[this.front];
    }

    @Override
    public T peek() {
        if (this.isEmpty()) {
            throw new IllegalStateException();
        }
        return this.elements[this.front+1];
    }

    @Override
    public int size() {
        if (this.front <= this.rear) {
            return this.rear - this.front;
        }
        return this.rear - this.front + this.maxSize;
    }

    @Override
    public void clear() {
        this.front = 0;
        this.rear = 0;
    }

    @Override
    public boolean isEmpty() {
        return this.front==this.rear;
    }

    private boolean isFull() {
        return this.front == (this.rear + 1)%this.maxSize;
    }

}
