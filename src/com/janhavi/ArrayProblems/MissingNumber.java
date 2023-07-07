package com.janhavi.ArrayProblems;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5 };
        int ans = findMissingNumber(arr, 5);
        System.out.print(ans);
    }

    static int findMissingNumber(int[] arr, int num) {
        int xor1 = 0;
        int xor2 = 0;

        for(int i = 0; i < num - 1; i ++) {
            xor1 = xor1 ^ (i + 1);
            xor2 = xor2 ^ arr[i];
        }

        xor1 = xor1 ^ num;
        return xor1 ^ xor2;

    }
}
