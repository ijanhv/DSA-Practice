package com.janhavi.recursion;

import java.util.ArrayList;
import java.util.List;

public class ArrayPermutations {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3};
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] visited = new boolean[arr.length];
        printAllPermutations( arr, visited, ans, new ArrayList<>());
        System.out.print(ans);
    }

    static void printAllPermutations( int[] arr, boolean[] visited, List<List<Integer>> ans, ArrayList<Integer> ds) {
        if(ds.size() == arr.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i = 0; i < arr.length; i ++) {
            if(!visited[i]) {
                visited[i] = true;
                ds.add(arr[i]);
                printAllPermutations(arr, visited, ans, ds);
                ds.remove(ds.size() - 1);
                visited[i] = false;
//            ds.remove(ds.size() - 1);
            }
        }
    }
}
