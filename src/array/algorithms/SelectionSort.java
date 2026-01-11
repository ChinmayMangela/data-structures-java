package array.algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {45,56,12,94,6,7};
        selectionSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr, int n) {
        for(int i = 0; i < n; i++) {
            int last = n - i - 1;
            int largestElementIndex = getMaxIndex(arr, last);
            swap(arr, largestElementIndex, last);
        }
    }

    public static int getMaxIndex(int[] arr, int n) {
        int max = 0;
        for(int i = 1; i <= n; i++) {
            if(arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
