package chap04;

import java.util.Scanner;

public class IntQueTester {

    public static void main(String[] args) {

        final Scanner sc = new Scanner(System.in);
        System.out.print("큐의 크기 설정 : ");
        int capacity = sc.nextInt();

        IntQueue intQueue = new IntQueue(capacity);

        outer : while (true) {

            System.out.println("현재 데이터 수 : "+intQueue.size()
            +" / "+intQueue.capacity());
            System.out.print("(1)인큐 (2)디큐 (3)피크 (4)덤프 (5)종료 : ");
            int menu = sc.nextInt();
            switch (menu) {
                case 1 :
                    System.out.print("인큐할 값을 입력하세요 : ");
                    int enqueNum = sc.nextInt();
                    try {
                        intQueue.enque(enqueNum);
                    }catch (IntQueue.OverflowIntQueueException e) {
                        System.out.println("큐가 가득 찼습니다");
                    }
                    break;
                case 2 :
                    try {
                        System.out.println("디큐한 데이터는 " + intQueue.deque() + "입니다");
                    } catch (IntQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비어 있습니다");
                    }
                    break;
                case 3 :
                    try {
                        System.out.println("피크할 데이터는 " + intQueue.peek() + "입니다");
                    } catch (IntQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비어 있습니다");
                    }
                    break;
                case 4 :
                    System.out.print("데이터 : ");
                    intQueue.dump();
                    break;
                case 5 :
                    System.out.println("프로그램을 종료합니다");
                    break outer;

                default:
                    System.out.println("올바른 숫자를 입력하세요");
                    break;
            }
            System.out.println();
        }

        sc.close();
    }
}
