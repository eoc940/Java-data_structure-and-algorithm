package chap05;

import java.util.Scanner;

public class Page166Factorial {

    //재귀 활용한 팩토리얼
    public static int factorial(int n) {
        if (n > 0) {
            return n * factorial(n-1);
        } else {
            return 1;
        }
    }

    //재귀 미활용한 팩토리얼
    public static int factorialPractice170(int n) {
        int result = 1;
        if (n > 0) {
            for (int i=n; i >= 1; i--) {
                result *= i;
            }
        } else {
            return 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.printf("%d! = %d 입니다\n", 5, factorial(5));
        System.out.printf("%d! = %d 입니다", -5, factorialPractice170(-5));
    }
}
