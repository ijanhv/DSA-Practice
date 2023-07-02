package com.janhavi.ArrayProblems;

import java.util.Arrays;

public class MoveZerosAtTheEnd {
    public static void main(String[] args) {
        int[] arr = { 1,0,2,3,2,0,0,4,5,1 };
        System.out.print(Arrays.toString(MoveZeros(arr)));
    }

    static int[] MoveZeros(int[] arr) {
        int j = -1;
        for(int i = 0; i < arr.length; i ++) {
            if(arr[i] == 0) {
                j = i;
                System.out.println(j);
                break;
            }
        }
        if(j == -1) return arr;

        for(int i = j + 1; i < arr.length; i ++) {
            if(arr[i] != 0) {
                swap(arr, i, j);
                j ++;
            }
        }

        return arr;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
