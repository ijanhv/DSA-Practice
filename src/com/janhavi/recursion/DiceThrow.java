package com.janhavi.recursion;

public class DiceThrow {
    public static void main(String[] args) {
        diceFace("", 4);
    }

    static void diceFace(String p, int target) {
        if(target == 0) {
            System.out.println(p);
            return;
        }

        for(int i = 1; i <= 6 && i <= target; i ++ ) {
            diceFace(p + i, target - i);
        }
    }
}
