package chap123;

import java.util.Arrays;
import java.util.Scanner;

public class page120 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("요솟수 : ");
        int index = sc.nextInt();
        int[] arr = new int[index];
        System.out.println("오름차순으로 입력하세요");
        System.out.print("x[0] : ");
        arr[0] = sc.nextInt();

        for (int i = 1; i < index; i++) {
            do {
                System.out.print("x["+i+"] : ");
                arr[i] = sc.nextInt();
            } while (arr[i] <= arr[i-1]);
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("검색할 값 : ");
        int find = sc.nextInt();
        int result = Arrays.binarySearch(arr, find);
        if (result < 0) {
            System.out.println("해당 값은 없습니다. 삽입 포인트는 "+(result*(-1)-1)+"입니다");
        } else {
            System.out.println(find+"는 x[" +result+ "]에 있습니다");
        }

    }
}
