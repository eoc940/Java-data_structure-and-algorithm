package chap123;

import java.util.Scanner;

public class BinSearch {

    static int binSearch(int[] a, int n, int key) {
        int pl = 0;
        int pr = n-1;

        do {
            int pc = (pl+pr)/2;
            if(a[pc] == key) {
                return pc;//인덱스를 리턴
            }else if (a[pc] < key){
                pl = pc+1;
            }else{
                pr = pc-1;
            }
        } while (pl <= pr);//아주 중요한 조건식. pl==pr이면 그 인덱스가 key랑 같은지 봐야하는데 다르게 나오면 pl>pr이 되어 반복문 빠져나감
        return -1;
    }

    static int binSearchX(int[] a, int n, int key) {
        int begin = 0;
        int end = n-1;

        do {
            int center = (begin + end) / 2;
            if(a[center] == key) {
                for (int i=0; i<center; i++) {
                    if(a[center - i] != a[center - i - 1]) {
                        return center-i;
                    }
                }
            }else if(a[center] < key) {
                begin = center + 1;
            }else{
                end = center - 1;
            }
        } while (begin <= end);
        return -1 ;
    }

    public static void main(String[] args) {

        int[] a = {1,3,5,7,7,7,8,8,9,9};
        System.out.println(binSearchX(a, 10, 7));
        Scanner sc = new Scanner(System.in);

        System.out.print("요소수 : ");
        int yoso = sc.nextInt();
        int[] xarr = new int[yoso];
        System.out.println("오름차순으로 입력하세요");
        System.out.print("x[0] = ");
        xarr[0] = sc.nextInt();
        for(int i=1; i<xarr.length; i++) {
            do {
                System.out.print("x["+ i +"] = ");
                xarr[i] = sc.nextInt();
            } while (xarr[i] <= xarr[i-1]);
        }
        System.out.print("검색할 값 : ");
        int inputValue = sc.nextInt();
        if(binSearch(xarr, yoso, inputValue) != -1) {
            System.out.println(inputValue+"은(는) x["+binSearch(xarr, yoso, inputValue)+"]에 있습니다");
        }else{
            System.out.println("해당 값은 존재하지 않습니다.");
        }
    }
}