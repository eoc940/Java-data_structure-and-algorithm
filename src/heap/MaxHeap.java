package heap;

import java.util.Arrays;
import java.util.Collections;

public class MaxHeap<T extends Comparable<T>> implements IHeap<T> {

    T[] data;
    int size;
    int maxSize;

    public MaxHeap(int maxSize) {
        this.maxSize = maxSize;
        this.data = (T[]) new Comparable[maxSize+1];
        this.size = 0;
    }

    private int parent(int pos) {
        return pos/2;
    }

    private int leftChild(int pos) {
        return pos * 2;
    }

    private int rightChild(int pos) {
        return pos * 2 + 1;
    }

    private boolean isLeaf(int pos) {
        return (pos > (size/2) && pos <= size);
    }

    @Override
    public void insert(T val) {
        this.data[++this.size] = val;

        int current = this.size;
        while (this.data[parent(current)] != null
                && this.data[current].compareTo(this.data[parent(current)]) > 0) {
            Collections.swap(Arrays.asList(this.data), current, parent(current));
            current = parent(current);
        }
    }

    @Override
    public boolean contains(T val) {
        for (int i = 1; i < this.size; i++) {
            if (val.equals(this.data[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public T pop() {
        T top = this.data[1];
        this.data[1] = this.data[this.size--];
        heapify(1);
        return top;
    }

    private void heapify(int idx) {
        if (isLeaf(idx)) {
            return;
        }
        T current = this.data[idx];
        T left = this.data[leftChild(idx)];
        T right = this.data[rightChild(idx)];
        if (current.compareTo(left) < 0 || current.compareTo(right) < 0) {
            if (left.compareTo(right) > 0) {
                Collections.swap(Arrays.asList(this.data), idx, leftChild(idx));
                heapify(leftChild(idx));
            } else {
                Collections.swap(Arrays.asList(this.data), idx, rightChild(idx));
                heapify(rightChild(idx));
            }
        }

    }

    @Override
    public T peek() {
        if (this.size < 1) {
            throw new RuntimeException();
        }
        return this.data[1];
    }

    @Override
    public int size() {
        return this.size;
    }
}
