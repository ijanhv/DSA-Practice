package com.janhavi.Strings;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "abcba";
        String ans = longestPalindrome(s);
        System.out.print(ans);
    }

    static String longestPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        int max = 0;

        while(i < j) {

            if(s.charAt(i) == s.charAt(j)) {
                int start = i;
                int end = j;
                while(start <= end) {
                    start ++;
                    end --;
                }

                int currentLength = j - i + 1;
                max = Math.max(max, currentLength);
//                System.out.print(max);
            } else {
                j --;
            }
            i ++;


        }

        return s.substring(i, i + max - 1);
    }
}
