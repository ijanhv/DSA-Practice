package com.janhavi.ArrayProblems;
import java.util.HashMap;

//Longest subarray with sum K

public class LongestSubarray {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 2, 3, 2, 1, 1, 1, 9 };
//        System.out.print(longestSubarrayWithSumK(arr, 15));
          System.out.print(longestSubArray(arr, 15));

    }

    static int longestSubarrayWithSumK (int[] arr, int k) {
      HashMap<Integer, Integer> hashMap = new HashMap<>();
      int maxLength = 0;
      int sum = 0;

      for(int i = 0; i < arr.length; i ++) {
          sum += arr[i];

          if(sum == k) {
              maxLength = i + 1;
          }

          if(hashMap.containsKey(sum - k)) {
              maxLength = Math.max(maxLength, i - hashMap.get(sum - k));
          }

          if(!hashMap.containsKey(sum)) {
              hashMap.put(sum, i);
          }

      }

      return maxLength;
    }

    static int longestSubArray(int[] arr, int k) {
        int currSum = 0;
        int maxLength = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length - 1; i ++) {
            currSum += arr[i];

            if(currSum > maxLength) {
               maxLength = i;
            }

            if(currSum < 0) {
                currSum = 0;
            }
        }

        return maxLength;
    }
}

