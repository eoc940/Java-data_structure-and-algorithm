package chap06;

import java.util.Arrays;

public class SelectionSort {

    static void swap(int[] a, int idx1, int idx2) {
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }

    static void selectionSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            swap(a, min, i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,2,5,3,1};
        selectionSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

}
