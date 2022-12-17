package com.janhavi.Stacks;

import java.util.Stack;

public class ValidParenthesis {

    public static boolean parenthesisChecker(String str) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i ++) {
            char x = str.charAt(i);
            if(x == '(' || x == '[' || x == '{') {
                st.push(x);
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                if(x == ')' && st.peek() == '('
                        || x == '}' && st.peek() == '{'
                        || x == ']' && st.peek() == '[') {
                    st.pop();
                } else {
                    return false;
                }
            }

        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String str = "[()]{}{[()()]()}";
        String str1 = "[{()}]";
        String str2 = "[()]{}{[()())}";

        System.out.println(parenthesisChecker(str));
        System.out.println(parenthesisChecker(str2));





    }
}
