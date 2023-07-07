package com.janhavi.ArrayProblems;

public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1 };
        int ans = findMaxNumOfOnes(arr);
        System.out.print(ans);
    }

    static int findMaxNumOfOnes(int[] arr) {
        int max = 0;
        int count = 0;

        for(int i = 0; i < arr.length; i ++) {
            if(arr[i] == 1) {
                count ++;
                if(count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }

        return max;
    }
}



