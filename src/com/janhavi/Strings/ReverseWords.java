package com.janhavi.Strings;

import java.util.Arrays;

public class ReverseWords {

    public static void main(String[] args) {
        String s = "the sky is blue";
        String[] ans = reverseWords(s);
        System.out.println(Arrays.toString(ans));

//        System.out.print(String.join(" ", ans));



    }


    static String[] reverseWords(String s) {

        String[] words = s.split(" ");
//        System.out.print(words[1]);
        for(int i = 0; i < words.length / 2; i ++) {
            swap(words, i, words.length - i - 1);
        }

        System.out.println(Arrays.toString(words));



        return words;
    }

    static void swap(String[] words, int a, int b) {
        String temp = words[a];
        words[a] = words[b];
        words[b] = temp;
    }
}
