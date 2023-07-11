package com.janhavi.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetSum1 {
    public static void main(String[] args) {
        int[] arr = { 1,2,3 };
//        int target = 3;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        findSubsets(0, 0, arr, ans,  new ArrayList<>());
        // this is only for array with unique elements
        System.out.print(ans);
    }

    static void findSubsets(int index, int sum, int[] arr, List<List<Integer>> ans, ArrayList<Integer> ds) {
        if (index == arr.length) {
                ans.add(new ArrayList<>(ds));

            return;
        }

        ds.add(arr[index]);
        findSubsets(index + 1, sum + arr[index], arr, ans,  ds);
        ds.remove(ds.size() - 1);

        // do not pick the element
        findSubsets(index + 1, sum, arr, ans,  ds);


    }
}
