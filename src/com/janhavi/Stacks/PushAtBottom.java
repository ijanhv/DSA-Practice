package com.janhavi.Stacks;

import java.util.Stack;
public class PushAtBottom {

    public static void pushAtBottom(int data, Stack<Integer> st) {
        if(st.isEmpty()) {
            st.push(data);
            return;
        }
        int top = st.pop();
        pushAtBottom(data, st);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        pushAtBottom(1, st);
        pushAtBottom(2, st);
        pushAtBottom(3, st);
        pushAtBottom(4, st);
//        pushAtBottom(5, st);

        while(!st.isEmpty()) {
            System.out.println(st.pop());

        }
    }
}
