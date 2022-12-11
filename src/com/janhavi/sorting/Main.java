package com.janhavi.sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 2,  4, 1};
        selection(arr);
        System.out.print(Arrays.toString(arr));

    }

    private static void selection(int[] arr) {
        for(int i = 0; i < arr.length; i ++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int maxIndex, int last) {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int last) {
        int maxIndex = start;
        for(int i = start; i <= last; i ++) {
            if(arr[i] > arr[maxIndex])
                maxIndex = i;
        }
        return maxIndex;
    }

}
