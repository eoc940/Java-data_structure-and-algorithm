package chap06;

import java.util.Scanner;

public class BubbleSort205Page {

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void bubbleSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            int exchange = 0;  //패스의 교환 횟수 기록
            for (int j = n - 1; j > i; j--) {
                if (a[j-1] > a[j]) {
                    exchange++;
                    swap(a, j-1, j);
                }
            }
            if (exchange == 0) break; //패스가 이루어지지 않으면 반복문 종료
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("버블 정렬(버전1)");
        System.out.print("요솟수 : ");
        int inputNum = scanner.nextInt();
        int[] numArr = new int[inputNum];
        for (int i = 0; i < inputNum; i++) {
            System.out.print("x["+ i +"] : ");
            numArr[i] = scanner.nextInt();
        }
        bubbleSort(numArr, inputNum);
        System.out.println("오름차순으로 정렬했습니다");
        for (int i = 0; i < numArr.length; i++) {
            System.out.println("x["+ i +"] = " + numArr[i]);
        }
    }

}
