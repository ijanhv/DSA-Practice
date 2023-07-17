package com.janhavi.Stacks;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String str) {
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < str.length(); i ++) {
            if (str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
                st.push(str.charAt(i));
            } else {
                if(st.isEmpty()) {
                    return false;
                }
                if (str.charAt(i) == '}' && st.peek() == '{'
                        || str.charAt(i) == ']' && st.peek() == '['
                        || str.charAt(i) == ')' && st.peek() == '(') {
                    st.pop();
                } else {
                    return false;
                }
            }

        }

        return st.isEmpty();
    }
    public static void main(String[] args) {
        String str = "({[]}()";

        System.out.print(isValid(str));

    }
}
