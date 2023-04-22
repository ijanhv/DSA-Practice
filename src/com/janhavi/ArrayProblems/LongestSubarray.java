package com.janhavi.ArrayProblems;
import java.util.HashMap;

//Longest subarray with sum K

public class LongestSubarray {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 2, 7, 1, 9 };
        System.out.print(longestSubarrayWithSumK(arr, 15));
    }

    static int longestSubarrayWithSumK (int[] arr, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        int maxLength = 0;
        for(int i = 0; i < arr.length; i ++) {
            sum += arr[i];
            if(sum == k) {
                maxLength = i + 1;
            }
            if(hm.containsKey(sum - k)) {
                maxLength = Math.max(maxLength, i - hm.get(sum - k));
            } else {
                hm.put(sum, i);
            }

        }
        return maxLength;
    }
}

