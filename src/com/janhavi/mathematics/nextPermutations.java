package com.janhavi.mathematics;

public class nextPermutations {
    public static String nextPermutation(String word) {
        char[] chars = word.toCharArray();
        int i = chars.length - 2;
        while (i >= 0 && chars[i] >= chars[i + 1]) {
            i--;
        }
        if (i < 0) {
            return "no answer";
        }
        int j = chars.length - 1;
        while (chars[j] <= chars[i]) {
            j--;
        }
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        reverse(chars, i + 1, chars.length - 1);
        return new String(chars);
    }

    private static void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        System.out.print(nextPermutation("abdc"));
    }
}
