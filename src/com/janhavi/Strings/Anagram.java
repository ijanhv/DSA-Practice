package com.janhavi.Strings;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String string1 = "listen";
        String string2 = "silent";

        if (checkAnagram(string1, string2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }


        public static boolean checkAnagram(String str1, String str2) {
            // Remove whitespace and convert to lowercase
            str1 = str1.toLowerCase().replaceAll("\\s", "");
            str2 = str2.toLowerCase().replaceAll("\\s", "");

            // Check if the lengths are equal
            if (str1.length() != str2.length()) {
                return false;
            }

            // Create an array to store character frequencies
            int[] charFrequencies = new int[26];

            // Update character frequencies for str1
            for (int i = 0; i < str1.length(); i ++) {
                charFrequencies[str1.charAt(i) - 'a'] ++;
                charFrequencies[str2.charAt(i) - 'a'] --;
                System.out.println(Arrays.toString(charFrequencies));

            }

            // Check character frequencies for str2
            for (int c : charFrequencies) {
                if (c != 0) {
                    return false; // Found a character not present in str1
                }
            }

            return true; // All characters are accounted for
        }




}
