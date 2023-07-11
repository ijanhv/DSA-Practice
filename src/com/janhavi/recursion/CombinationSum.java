package com.janhavi.recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> ans = new ArrayList<>();
        printCombinationSet(0, arr, ans, target, new ArrayList<>());
        System.out.print(ans);
    }

    static void printCombinationSet(int index, int[] arr, List<List<Integer>> ans, int target, ArrayList<Integer> ds) {
       if(index == arr.length) {
           if(target == 0) {
               ans.add(new ArrayList<>(ds));
           }
           return;
       }

       if(arr[index] <= target) {
           ds.add(arr[index]);
           printCombinationSet(index,  arr, ans, target - arr[index], ds);
           ds.remove(ds.size() - 1);
       }

       printCombinationSet(index + 1, arr, ans,  target, ds);
    }
}
