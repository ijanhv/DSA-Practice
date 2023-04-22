package com.janhavi.ArrayProblems;

public class BreakPalindrome {
    public static String breakPalindrome(String palindrome) {
        if (palindrome.length() <= 1) {
            return "";
        }
        char[] sArray = palindrome.toCharArray();
        int lo = 0, hi = sArray.length - 1;
        // find and replace first non 'a' with 'a' from the first half of the palindrome
        // for odd-length palindromes, exclude the middle character
        while (lo < sArray.length / 2) {
            if (sArray[lo] != 'a') {
                sArray[lo] = 'a';
                return new String(sArray);
            }
            lo++;
        }

        // the first half only has 'a's, replace the last character with its next neighbor
        sArray[hi] = (char) ((int) sArray[hi] + 1);
        return new String(sArray);
    }

    public static void main(String[] args) {
        System.out.println(breakPalindrome("aabccbaa"));
    }
}
