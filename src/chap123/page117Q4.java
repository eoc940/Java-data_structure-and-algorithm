package chap123;

import java.util.Scanner;

public class page117Q4 {

    static void printArr(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(" "+arr[i]+" ");
        }
        System.out.println();
    }

    static void printIndex(int n) {
        for(int i=0;i<n; i++) {
            System.out.print(" " +i+ " ");
        }
        System.out.println();
    }
    static void printFirstLine(int begin, int end) {
        int cen = (begin+end) / 2;
        System.out.print("  |");
        for(int i=0; i<3*begin+1; i++) {
            System.out.print(" ");
        }
        System.out.print("<");
        for(int i=3*begin+1; i<3*cen; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        for(int i=3*cen + 2; i<3*end-2;i++) {
            System.out.print(" ");
        }
        System.out.print(">");
        System.out.println();
    }

    static void printSecondLine(int[] arr, int begin, int end) {
        int cen = (begin + end) / 2;
        System.out.print(" "+ cen+"|");
        for (int i=0; i<arr.length; i++) {
            System.out.print(" "+arr[i]+" ");
        }

    }

    static void printSign(int[] arr, int value) {
        int begin=0;
        int end = arr.length;
        do {
            int cen = (begin+end) / 2;
            printFirstLine(begin, end);
            printSecondLine(arr, begin, end);
            if(arr[cen] == value) {
                 return;
            }else if(arr[cen] < value) {
                 begin = cen+1;

            }else{
                end = cen-1;

            }
            System.out.println();
            System.out.println("  |");
        } while (begin <= end);
        System.out.println();
    }

    static int binSearch(int[] arr, int value) {
        int begin=0;
        int end = arr.length;
        do {
            int cen = (begin + end) / 2;
            if(arr[cen] == value) {
                return cen;
            }else if(arr[cen] < value) {
                begin = cen+1;
            }else{
                end = cen-1;
            }
        } while (begin <= end);
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("요소수 값을 입력하세요 : ");
        int num = sc.nextInt();

        int[] inputArr = new int[num];
        do {
            System.out.print("x[0] : ");
            inputArr[0] = sc.nextInt();
        } while (inputArr[0] > 10);

        for(int i=1; i<num; i++) {
            do {
                System.out.print("x["+i+"] : ");
                inputArr[i] = sc.nextInt();
            }while (inputArr[i] <= inputArr[i-1] || inputArr[i] > 10);
        }
        System.out.print("검색하실 값을 입력하세요 : ");
        int find = sc.nextInt();
        System.out.print("  |");
        printIndex(num);
        System.out.println("---------------------------------");
        printSign(inputArr, find);
        System.out.println();
        if (binSearch(inputArr, find) == -1) {
            System.out.println("검색하시려는 값이 없습니다");
        }else{
            System.out.println(find+"는 x[" +binSearch(inputArr, find)+ "]에 있습니다");
        }


    }

}

