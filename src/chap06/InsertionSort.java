package chap06;

import java.util.Arrays;

public class InsertionSort {

    static void insertionSort(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            int tmp = a[i];
            int j;
            for (j = i; j>0 && a[j-1] > tmp; j--) {
                a[j] = a[j-1];
            }
            a[j] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {6,3,25,36,7,3,1};
        insertionSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
