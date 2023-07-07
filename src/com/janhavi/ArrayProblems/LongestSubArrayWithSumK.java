package com.janhavi.ArrayProblems;

public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,1,1,1,1,3,3};
        int ans = lognestSubarray(arr, 6);
        System.out.print(ans);
    }

    static int lognestSubarray(int[] arr, int k) {
        int i = 0;
        int j = 0;
        int maxLength = 0;
        int sum = arr[0];

        while(i < arr.length) {
            while(sum > k && j <= i) {
                sum -= arr[j];
                j ++;
            }
            if(sum  == k) {
                maxLength = Math.max(maxLength, i - j + 1);
            }
            i ++;
            if(i < arr.length) {
                sum += arr[i];
            }
        }

        return maxLength;
    }
}
