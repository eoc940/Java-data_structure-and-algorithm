package chap123;

import java.util.Scanner;

public class page115 {

    static void printArr(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(" "+arr[i]+" ");
        }
        System.out.println();
    }
    static void printStar(int n) {
        for(int i=0; i<3*n+1; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
    }
    static int returnIndex(int[] arr, int value) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == value) {
                return i;
            }
        }
        return -1;
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("요소수를 입력하세요 : ");
        int index = sc.nextInt();
        int[] arr = new int[index];

        
        for (int i = 0; i < index; i++) {
            do {
                arr[i] = sc.nextInt();
                if(arr[i] > 10) {
                    System.out.println("10이하의 자연수를 입력하세요");
                }
            }while (arr[i] > 10);
        }        
        
        System.out.print("찾을 값을 입력하세요 : ");
        int find = sc.nextInt();
        System.out.print("  |");
        for (int i=0; i<index; i++) {
            System.out.print(" "+i+" ");
        }
        System.out.println();
        System.out.println("-----------------------------------");
        for(int i=0; i<index; i++) {
            System.out.print("  |");
            printStar(i);
            System.out.print(" "+i+"|");
            printArr(arr);
            if(returnIndex(arr, find) == i) {
                break;
            }
        }
        if(returnIndex(arr, find) == -1) {
            System.out.println("검색하려는 값이 없습니다.");
        }else{
            System.out.println(find+"는 x[" +returnIndex(arr, find)+ "]에 있습니다");
        }


    }

}
