package com.janhavi.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationalSum2 {

    public static void main(String[] args) {
        int[] arr = { 2,5,2,1,2 };
        int target = 5;
        List<List<Integer>> combinations = combinationSum2(arr, target);
        System.out.println(combinations);
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(0, candidates, ans, target, new ArrayList<Integer>());
        return ans;
    }

    public static void findCombinations(int index, int[] arr, List<List<Integer>> ans, int target, ArrayList<Integer> list) {
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            if (i > index && arr[i] == arr[i - 1]) {
                continue; // Skip duplicates
            }

            if(arr[i] > target) break;

            if (arr[i] <= target) {
                list.add(arr[i]);
                findCombinations(i + 1, arr, ans, target - arr[i], list);
                list.remove(list.size() - 1);
            }
        }
    }
}
