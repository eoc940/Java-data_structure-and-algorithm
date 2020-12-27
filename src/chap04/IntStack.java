package chap04;

public class IntStack {
    private int max;
    private int ptr;
    private int[] stk;

    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {
            System.out.println("인덱스 없음");
        }
    }

    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {
            System.out.println("인덱스 초과");
        }
    }

    public IntStack(int capacity) {
        ptr = 0;
        max = capacity;
        try {
            stk = new int[max];
        }catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public int push(int x) throws OverflowIntStackException{
        if(ptr >= max) throw new OverflowIntStackException();
        return stk[ptr++] = x;
    }

    public int pop() throws EmptyIntStackException{
        if(ptr <= 0) throw new EmptyIntStackException();
        return stk[--ptr];
    }

    public int peek() throws EmptyIntStackException{
        if(ptr <= 0) throw new EmptyIntStackException();
        return stk[ptr-1];
    }

    public int indexOf(int num) throws EmptyIntStackException {
        for(int i=ptr-1;i>=0 ;i-- ) {
            if(stk[i] == num) {
                return i;
            }
        }
        return -1;
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

    public boolean IsEmpty() {
        return ptr <= 0;
    }

    public boolean IsFull() {
        return ptr >= max;
    }

    public void dump() {
        if (ptr <= 0) {
            System.out.println("스택이 비어있습니다");
        }else {
            for(int i=ptr-1; i>=0 ; i--) {
                System.out.print("stk[" +i+ "]="+stk[i] + " ");
            }
            System.out.println();
        }
    }
}
