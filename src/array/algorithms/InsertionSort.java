package array.algorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {45,56,12,44,6,7};
        insertionSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr, int n) {
        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j > 0; j--) {
                if(arr[j] < arr[j - 1]) {
                    swap(arr, j , j - 1);
                } else {
                    break;
                }
            }
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
