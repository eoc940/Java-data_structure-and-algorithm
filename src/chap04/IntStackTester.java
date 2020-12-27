package chap04;

import java.util.Scanner;

public class IntStackTester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("스택 크기를 입력하세요 : ");
        int capacity = sc.nextInt();
        IntStack stack = new IntStack(capacity);

        outer : while (true) {
            System.out.println();
            System.out.println("현재 데이터 수 : " + stack.size()+"/"+stack.capacity() );
            System.out.print("(1)푸시 (2)팝 (3)피크 (4)덤프 (5)인덱스찾기 (6)초기화 (7)비었니 (8)가득찼니 (0)종료 : ");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("데이터 : ");
                    int data = sc.nextInt();
                    try {
                        stack.push(data);
                    }catch (IntStack.OverflowIntStackException e) {
                        System.out.println("스택이 가득 찼습니다");
                    }
                    break;

                case 2:
                    try {
                        System.out.println("팝한 데이터는 " +stack.pop()+ "입니다");
                    }catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다");
                    }
                    break;

                case 3:
                    try {
                        System.out.println("피크한 데이터는 " +stack.peek()+ "입니다");
                    }catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다");
                    }
                    break;

                case 4:
                    stack.dump();
                    break;

                case 5:
                    System.out.print("검색할 숫자를 입력하세요 : ");
                    int num = sc.nextInt();
                    try {
                        System.out.println("찾으시는 인덱스 번호는 "+stack.indexOf(num)+"입니다");
                    }catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어서 인덱스를 찾을 수 없습니다.");
                    }
                    break;
                case 6:
                    stack.clear();
                    break;
                case 7:
                    if(stack.IsEmpty()) System.out.println("스택이 비어있습니다");
                    else System.out.println("스택이 비어있지 않습니다");
                    break;
                case 8:
                    if(stack.IsFull()) System.out.println("스택이 가득차있습니다");
                    else System.out.println("스택이 가득차지 않았습니다");
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    break outer;
            }
        }

    }
}
