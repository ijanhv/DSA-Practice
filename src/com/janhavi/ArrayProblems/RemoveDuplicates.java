package com.janhavi.ArrayProblems;

import java.util.Arrays;

public class RemoveDuplicates {
    static void removeDuplicates(int[] arr) {
        int i = 0;
        int j = i + 1;

        while(j < arr.length) {
            if(arr[i] == arr[j]) {
                j ++;
            } else {
                arr[i + 1] = arr[j];
                i ++;
            }

        }

        System.out.println(Arrays.toString(arr));

        for(int k = 0; k < i + 1; k ++) {
            System.out.print(arr[k]);
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6, 7 };
        removeDuplicates(arr);

    }
}
