package com.janhavi.mathematics;

import java.util.Arrays;

public class LongestEvenLengthWord {
    public static String findLongestEvenWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestEvenWord = "";
        for (String word : words) {
            if (word.length() % 2 == 0 && word.length() > longestEvenWord.length()) {
                longestEvenWord = word;
            }
        }
        return longestEvenWord;
    }

    public static void main(String[] args) {
        System.out.println(findLongestEvenWord("Time to hahaha write great code"));

    }
}
