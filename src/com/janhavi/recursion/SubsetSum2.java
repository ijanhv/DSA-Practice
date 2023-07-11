package com.janhavi.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetSum2 {
    public static void main(String[] args) {
        int[] arr = { 2,5,2,1,2 };
        int target = 5;
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        findSubsets2(0, arr, ans, target, new ArrayList<>());
        System.out.println(ans);
    }

    // this will work for array with duplicate elements

    static void findSubsets2(int index, int[] arr, List<List<Integer>> ans, int target, ArrayList<Integer> ds) {

            ans.add(new ArrayList<>(ds));


        for(int i = index; i < arr.length; i ++) {
            if(i != index && arr[i -1] == arr[i]) continue;
            ds.add(arr[i]);
            findSubsets2(i + 1, arr, ans, target, ds);
            ds.remove(ds.size() - 1);
        }


    }

}
