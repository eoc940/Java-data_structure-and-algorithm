package chap06;

import java.util.Scanner;

public class BubbleSort204PageQuiz2 {

    static int compare = 0;
    static int change = 0;

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void printArr(int[] a, int idx) {
        if (a[idx - 1] > a[idx]) {
            for (int i = 0; i < a.length; i++) {
                if (i == idx - 1) {
                    System.out.printf(" %d +", a[i]);
                } else {
                    System.out.printf(" %d  ", a[i]);
                }
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < a.length; i++) {
            if (i == idx - 1) {
                System.out.printf(" %d -", a[i]);
            } else {
                System.out.printf(" %d  ", a[i]);
            }
        }
        System.out.println();
    }

    static void bubbleSort(int[] a, int n) {
        for (int i = 0; i < n-1; i++) {
            System.out.println("패스" + (i+1) + ":");
            for (int j = n-1; j > i; j--) {
                compare++;
                printArr(a, j);
                if (a[j-1] > a[j]) {
                    swap(a, j-1, j);
                    change++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("버블 정렬(버전3)");
        System.out.print("요솟수 : ");
        int inputNum = scanner.nextInt();
        int[] numArr = new int[inputNum];
        for (int i = 0; i < inputNum; i++) {
            System.out.print("x["+ i +"] : ");
            numArr[i] = scanner.nextInt();
        }
        bubbleSort(numArr, inputNum);
        System.out.println("최종 정렬 결과");
        for (int i = 0; i < numArr.length; i++) {
            System.out.print(" " + numArr[i] + "  ");
        }
        System.out.println();
        System.out.printf("비교를 %d회 했습니다", compare);
        System.out.println();
        System.out.printf("교환을 %d회 했습니다", change);

    }
}
