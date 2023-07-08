package com.janhavi.recursion;

public class Permutations {
    public static void main(String[] args) {
        permutations("", "abc");
        System.out.print(permutationsNumber("", "abcd"));
    }

    static void permutations(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); i ++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutations(f + ch + s, up.substring(1));
        }
    }


    static int permutationsNumber(String p, String up) {
        int count = 0;
        if(up.isEmpty()) {

            return 1;
        }

        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); i ++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count += permutationsNumber(f + ch + s, up.substring(1));
        }

        return count;
    }
}
