package com.janhavi.Stacks;

import java.util.Stack;

public class DuplicateParenthesis {

    public static boolean isDuplicate(String str) {
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < str.length(); i ++) {
            char ch = str.charAt(i);

            if(ch == ')') {
                int count = 0;
                while(st.peek() != '(') {
                    st.pop();
                    count++;
                }

                if(count < 1) {
                    return true;
                } else {
                    st.pop();
                }
            } else {
                st.push(ch);
            }
        }

        return false;
    }


    public static void main(String[] args) {
        String str = "((a+b))";
        String str1 = "(a+b)";

        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str1));
    }
}
