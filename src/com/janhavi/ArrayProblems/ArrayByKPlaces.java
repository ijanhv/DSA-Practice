package com.janhavi.ArrayProblems;

import java.util.Arrays;

public class ArrayByKPlaces {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        RotateArrayBrute(arr, 4); // 4567123
//        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(RotateArrayBetter(arr, 3)));
    }

    static void RotateArrayBrute(int[] arr, int num) {
        int temp;
        for(int j = 0; j < num; j ++) {
            temp = arr[0];
            for(int i = 1; i < arr.length; i ++) {
                arr[i -1] = arr[i];
            }
            arr[arr.length - 1] = temp;
        }
    }

    static int[] RotateArrayBetter(int[] arr, int num) {
        num = num % arr.length;

        int[] temp = new int[num];
        for(int i = 0; i < num; i ++) {
            temp[i] = arr[i];
        }
        System.out.println(Arrays.toString(temp));
        for(int i = num; i < arr.length; i ++ ) {
            arr[i - num] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        for(int i = arr.length - num; i < arr.length; i ++) {
            arr[i] = temp[i - (arr.length-num)];

        }


        return arr;


    }
}
