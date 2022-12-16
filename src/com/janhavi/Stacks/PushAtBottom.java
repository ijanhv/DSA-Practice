package com.janhavi.Stacks;

import java.util.Stack;

public class PushAtBottom {

     public static void pushAtBottom(Stack<Integer> st, int data) {
        if(st.isEmpty()) {
            st.push(data);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, data);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(2);
//        pushAtBottom(st,10);
        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }

    }
}
