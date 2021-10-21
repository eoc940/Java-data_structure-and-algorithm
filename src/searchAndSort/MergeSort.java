package searchAndSort;

public class MergeSort implements ISort{
    @Override
    public void sort(int[] arr) {
        // in-place sort
        mergeSort(arr, 0, arr.length-1);
    }

    // 분할
    private void mergeSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = low + ((high - low) / 2);
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);

        merge(arr, low, mid, high);
    }

    // 합병
    private void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high-low+1];
        int idx = 0;

        int left = low; // 분할된 왼쪽 리스트의 시작 인덱스
        int right = mid + 1; // 분할된 오른쪽 리스트의 시작 인덱스

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[idx] = arr[left];
                left++;
            } else {
                temp[idx] = arr[right];
                right++;
            }
            idx++;
        }
        while (left <= mid) {
            temp[idx] = arr[left];
            idx++;
            left++;
        }
        while (right <= high) {
            temp[idx] = arr[right];
            idx++;
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp[i - low];
        }


    }

}
