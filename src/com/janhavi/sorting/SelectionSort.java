package com.janhavi.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = { 3, 1, 4, 5, 2};

        sortUsingSelectionSort(arr);
        System.out.print(Arrays.toString(arr));
    }

    static void sortUsingSelectionSort(int[] arr) {
        for(int i = 0; i < arr.length; i ++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static int getMaxIndex(int[] arr, int start, int end) {
        int maximum = start;
        for(int i = start; i <= end; i ++) {
            if(arr[maximum] < arr[i]) {
                maximum = i;
            }
        }

        return maximum;
    }
}
