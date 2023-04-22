package com.janhavi.mathematics;

import java.util.Arrays;

public class LongestEvenLengthWord {
    public static int findLongestEvenWord(String sentence) {
        String[] words = sentence.split(" ");
        int longestEvenWordLength = 0;
        for (String word : words) {
            if (word.length() % 2 == 0 && word.length() > longestEvenWordLength) {
                longestEvenWordLength = word.length();
            }
        }
        return longestEvenWordLength;
    }

    public static void main(String[] args) {
        System.out.println(findLongestEvenWord("I love coding codiinnggg so much"));

    }
}
