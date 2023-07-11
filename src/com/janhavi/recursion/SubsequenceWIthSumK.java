package com.janhavi.recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SubsequenceWIthSumK {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int target = 2;
        List<List<Integer>> ans = new ArrayList<>();
        printSubSeq(0, 0, target, new ArrayList<>(), arr, ans);
        System.out.print(ans);
    }

    static void printSubSeq(int index, int sum, int target, ArrayList<Integer> ds, int[] arr, List<List<Integer>> ans) {
        if(index == arr.length) {
            if (sum == target) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        ds.add(arr[index]);
        sum += arr[index];
        printSubSeq(index + 1, sum,  target, ds, arr, ans);
        sum -= arr[index];
        ds.remove(ds.size() - 1);

        printSubSeq(index + 1, sum, target, ds, arr, ans);
    }
}
