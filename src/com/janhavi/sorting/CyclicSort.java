package com.janhavi.sorting;

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 1, 4, 0 };
        sortUsingCyclic2(arr);
        System.out.print(Arrays.toString(arr));
    }

    static void sortUsingCyclic(int[] arr) {
        for(int i = 0; i < arr.length; i ++) {
            while(i != arr[i] - 1) {
                swap(arr, i, arr[i] - 1);
            }
        }
    }

    static void sortUsingCyclic2(int[] arr) {
        int i = 0;
        int count = 0;
        while(i < arr.length) {
            if(i != arr[i]) {
                swap(arr, i, arr[i] );
                count ++;
            } else i ++;

        }

        System.out.print(count);

//        int i = 0;
//        while(i < arr.length) {
//            if(i != arr[i]) {
//                if(arr[i] >= arr.length) {
//                    break;
//                }
//                swap(arr, i, arr[i]);
//            } else i ++;
//
//        }

    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
