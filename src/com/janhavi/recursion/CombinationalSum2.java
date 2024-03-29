package com.janhavi.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationalSum2 {

    public static void main(String[] args) {
        int[] arr = { 2,5,2,1,2 };
        int target = 5;
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations2(0, arr, ans, target, new ArrayList<>());
        System.out.println(ans);
    }

    public static void findCombinations2(int index, int[] arr, List<List<Integer>> ans, int target, ArrayList<Integer> ds) {

        if(target == 0 ) ans.add(new ArrayList<>(ds));

        for(int i = index; i < arr.length; i ++) {
            if( i != index && arr[i - 1] == arr[i]) continue;
            ds.add(arr[i]);
            findCombinations2(index + 1, arr, ans, target - arr[i], ds);
            ds.remove(ds.size() - 1);

        }
    }
}
