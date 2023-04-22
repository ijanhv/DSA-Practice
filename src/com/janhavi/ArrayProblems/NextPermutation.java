package com.janhavi.ArrayProblems;

public class NextPermutation {
    public static String nextPermutation(String word) {
        char[] chars = word.toCharArray();
        int index = -1;
        int n = chars.length;
        for(int i = n-2; i >= 0; i --) {
            if(chars[i] < chars[i+1]) {
                index = i;
                break;
            }
        }

        if(index == -1) {
            return "no answer";
        }

        for(int j = n-1; j >= index; j --){
            if(chars[j] > chars[index]) {
                swap(chars, index, j);
                break;
            }
        }
        reverseArray(chars, index + 1, n - 1);
        return new String(chars);
    }

    public static void reverseArray(char[] chars, int start, int end) {
        while(start < end) {
            swap(chars, start, end);
            start ++;
            end --;
        }
    }

    public static void swap(char[] chars, int start, int end) {
        char temp = chars[start];
        chars[start] = chars[end];
        chars[end] = temp;
    }

    public static void main(String[] args) {
        System.out.print(nextPermutation("aabc"));
    }

}
