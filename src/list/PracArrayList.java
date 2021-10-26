package list;

import java.util.Arrays;

public class PracArrayList<T> {

    private int size;
    private final static int DEFAULT_SIZE = 50;
    private T[] arrayList;

    public PracArrayList() {
        this.size = 0;
        arrayList = (T[]) new Object[DEFAULT_SIZE];
    }

    public void add(T data) {
        if (this.size == this.arrayList.length) {
            arrayList = Arrays.copyOf(arrayList, DEFAULT_SIZE * 2);
        }
        arrayList[this.size++] = data;

    }

    public void insert(int idx, T data) {
        if (this.size == this.arrayList.length) {
            arrayList = Arrays.copyOf(arrayList, DEFAULT_SIZE * 2);
        }
        if (idx >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = this.size-1; i >= idx; i--) {
            arrayList[i+1] =  arrayList[i];
        }
        arrayList[idx] = data;
        this.size++;

    }

    public boolean delete(T data) {
        for (int i = 0; i < this.size; i++) {
            if (this.arrayList[i].equals(data)) {
                // 값 옮겨주기
                for (int j = i; j < this.size; j++) {
                    this.arrayList[j] = this.arrayList[j + 1];
                }
                this.size--;
                return true;
            }
        }
        return false;
    }

    public boolean deleteByIndex(int idx) {
        if (idx < 0 || idx >= this.size) {
            return false;
        }
        for (int i = idx; i < this.size; i++) {
            arrayList[i] = arrayList[i + 1];
        }
        this.size--;
        return true;
    }

    public boolean contains(T data) {
        for (T t : arrayList) {
            if (t == data) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return this.size;
    }

    public void clear() {
        this.size = 0;
    }

    public T[] print() {
        return Arrays.copyOf(arrayList, this.size);
    }

}
