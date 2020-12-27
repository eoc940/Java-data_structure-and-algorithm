package chap04;

import com.sun.tools.javac.Main;

import java.sql.SQLOutput;
import java.util.Arrays;

public class IntAryQueue {

    private int max;
    private int num;
    private int[] que;

    public class EmptyIntAryQueueException extends RuntimeException {
        public EmptyIntAryQueueException() {};
    }

    public class OverflowIntAryQueueException extends RuntimeException {
        public OverflowIntAryQueueException() {};
    }

    public IntAryQueue(int capacity) {
        max = capacity;
        num = 0;
        try {
            que = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public int enque(int x) throws OverflowIntAryQueueException{
        if (num >= max) throw new OverflowIntAryQueueException();
        return que[num++] = x;
    }

    public int deque() throws  EmptyIntAryQueueException{
        if (num <= 0) throw new EmptyIntAryQueueException();
        int x = que[0]; //미리 리턴할꺼 빼놓는다
        for (int i=0; i<num - 1 ; i++) {
            que[i] = que[i+1];
        }
        num--;
        return x;
    }

    public int peek() throws EmptyIntAryQueueException{
        if (num <= 0) throw new EmptyIntAryQueueException();
        return que[num - 1];
    }

    public void dump() {
        if (num <= 0) {
            throw new EmptyIntAryQueueException();
        }else{
            for (int i = 0; i<num; i++) {
                System.out.print(que[i] + " ");
            }
        }
    }

    public int indexOf(int x) {
        for (int i=0; i<num; i++) {
            if (que[i] == x) {
                return i;
            }
        }
        return -1;
    }

    //clear, capacity, size, isempty, isfull

    public void clear() {
        num = 0;
    }

    public int capacity() {
        return max;
    }

    public int size() {
        return num;
    }

    public boolean isEmpty() {
        return num <= 0;
    }

    public boolean isFull() {
        return num >= max;
    }

    //메인 실행 함수
    public static void main(String[] args) {
        IntAryQueue queue = new IntAryQueue(5);
        queue.enque(3);
        queue.enque(5);
        queue.enque(6);
        queue.enque(1);
        queue.enque(9);
        queue.dump();
        if (queue.isFull()) System.out.println("꽉찼습니다");
        else System.out.println("꽉 차진 않았습니다");

        queue.deque();
        if (queue.isFull()) System.out.println("꽉찼습니다");
        else System.out.println("꽉 차진 않았습니다");
        System.out.println(queue.capacity());
        System.out.println(queue.size());

        queue.clear();
        if (queue.isEmpty()) System.out.println("비었습니다");
        else System.out.println("비어있진 않습니다");
        System.out.println(queue.capacity());
        System.out.println(queue.size());
        queue.enque(4);
        queue.dump();

    }

}
