package chap04;

public class Gstack<E> {
    private int max;
    private int ptr;
    private E[] stk;

    public static class EmptyGstackException extends RuntimeException{
        public EmptyGstackException() {
            System.out.println("인덱스 없음");
        }
    }

    public static class OverflowGstackException extends RuntimeException {
        public OverflowGstackException() {
            System.out.println("인덱스 가득참");
        }
    }

    public Gstack(int capacity) {
        ptr = 0;
        max = capacity;
        try {
            stk = (E[]) new Object[max];
        }catch (OutOfMemoryError e) {
            max = 0;
        }

    }

    public E push(E x)throws OverflowGstackException {
        if(ptr >= max) throw new OverflowGstackException();
        return stk[ptr++] = x;
    }

    public E pop() throws EmptyGstackException {
        if(ptr <= 0) throw new EmptyGstackException();
        return stk[--ptr];
    }

    public E peek() throws EmptyGstackException {
        if(ptr <= 0) throw new EmptyGstackException();
        return stk[ptr-1];
    }

    public int indexOf(E x) {
        for(int i=ptr-1; i>=0; i--) {
            if(stk[i].equals(x)) {
                return i;
            }
        }
        return -1;
    }
    public void dump() {
        if(ptr <= 0) {
            System.out.println("스택이 비어 있습니다");
        }else {
            for (int i=ptr-1; i>=0; i--) {
                System.out.print(stk[i] + " ");
            }
        }
    }

    public void clear() {
        ptr = 0;
    }

    public int capacity() {
        return max;
    }

    public int size() {
        return ptr;
    }

    public boolean isEmpty() {
        return (ptr <= 0);
    }

    public boolean isFull() {
        return (ptr >= max);
    }

}
