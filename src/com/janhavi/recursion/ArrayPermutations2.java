package com.janhavi.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPermutations2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        List<List<Integer>> ans = new ArrayList<>();
        printAllPermutations(0, arr, ans);
        System.out.print(ans);
    }

    static void printAllPermutations(int index, int[] arr,  List<List<Integer>> ans) {
        if(index == arr.length) {
            List<Integer> ds = new ArrayList<>();
            for(int i = 0; i < arr.length; i ++) {
                ds.add(arr[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i = index; i < arr.length; i ++) {
            swap(i, index, arr);
            printAllPermutations(index + 1, arr, ans);
            swap(i, index, arr);
        }

    }

    static void swap(int a, int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
