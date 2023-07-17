package com.janhavi.Strings;

import java.util.HashMap;
import java.util.Map;

public class PermutationCount {
    public static void main(String[] args) {
        String bigString = "cbabcacabcacbabcab";
        String smallString = "abc";
        int count = countPermutations(bigString, smallString);
        System.out.println("Count of permutations: " + count);
    }

    public static int countPermutations(String bigString, String smallString) {
        int count = 0;
        int smallLength = smallString.length();
        int bigLength = bigString.length();

        // Create frequency maps for smallString and a sliding window for bigString
        Map<Character, Integer> smallFreqMap = new HashMap<>();
        Map<Character, Integer> windowMap = new HashMap<>();

        for (char c : smallString.toCharArray()) {
            smallFreqMap.put(c, smallFreqMap.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < bigLength; i++) {
            char currentChar = bigString.charAt(i);

            // Add the current character to the window map
            windowMap.put(currentChar, windowMap.getOrDefault(currentChar, 0) + 1);

            // Remove characters from the window map if they are outside the sliding window
            if (i >= smallLength) {
                char leftChar = bigString.charAt(i - smallLength);
                if (windowMap.get(leftChar) > 1) {
                    windowMap.put(leftChar, windowMap.get(leftChar) - 1);
                } else {
                    windowMap.remove(leftChar);
                }
            }

            // Check if the frequency maps match
            if (windowMap.equals(smallFreqMap)) {
                count++;
            }
        }

        return count;
    }
}
