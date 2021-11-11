package callBy;

/**
 * 자바는 기본형 타입 변수와 참조형 타입 변수가 있는데
 * 둘 다 상관없이 call by value 방식으로 메서드에서 받아진다
 *
 * 기본형 타입은 그 값을 복사해서 주지만
 * 참조형 타입은 값의 레퍼런스(주소)가 저장되는 것이므로 그 값의 레퍼런스가
 * 복사 되어진다. 즉 값의 레퍼런스(주소)가 call by value 방식으로 넘어간다
 *
 * 밑의 코드는 자바로 call by reference를 표현한 것이다
 */

public class CallByReference {

    private static class Number {
        int number;

        Number(int number) {
            this.number = number;
        }
    }

    private static void swap(Number x, Number y) {
        int tmp = x.number;
        x.number = y.number;
        y.number = tmp;

    }


    public static void main(String[] args) {

        Number a = new Number(10);
        Number b = new Number(20);

        System.out.println("Before Swapping");
        System.out.println("a = " + a.number + ", b = " + b.number);

        swap(a,b);

        System.out.println("\n" + "After Swapping");
        System.out.println("a = " + a.number + ", b = " + b.number);

    }
}

