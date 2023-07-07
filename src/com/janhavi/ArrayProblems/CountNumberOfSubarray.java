package com.janhavi.ArrayProblems;

public class CountNumberOfSubarray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 2, 1 };
        System.out.print(subarraySum(arr, 3));
    }

    static int subarraySum(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int n = nums.length;
        int sum = nums[0];
        int count = 0;

        while(right < n) {
            if(sum == k) {
                count ++;
            }

            if(sum <= k) {
                right ++;
                if(right < n) {
                    sum += nums[right];
                }
            } else {
                sum -= nums[left];
                left ++;

            }
        }

        return count;

    }
}
