package com.janhavi.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {  92, 53 };
        insertion2(arr);
        System.out.print(Arrays.toString(arr));
    }

    static void insertion(int[] arr) {
        for(int i = 0; i < arr.length - 1; i ++) {
            for(int j = i + 1; j > 0; j --) {
                if(arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;

                }
            }
        }
    }

    static void insertion2(int[] arr) {
        for(int i = 0; i < arr.length - 1; i ++) {
            int j = i + 1;
            while(j > 0) {
                if(arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                    j --;
                } else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

