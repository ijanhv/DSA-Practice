package com.janhavi.mathematics;

public class Flips {
    public static int minFlips(String target) {
        char curr = '1';
        int count = 0;
        for (int i = 0; i < target.length(); i++) {
            if (target.charAt(i) == curr) {
                count++;
                curr = (char)(48 + (curr + 1) % 2);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.print(minFlips("0100110"));
    }
}
