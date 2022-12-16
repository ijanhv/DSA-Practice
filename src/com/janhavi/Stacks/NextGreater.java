package com.janhavi.Stacks;

import java.util.Arrays;
import java.util.Stack;

public class NextGreater {
    public static int[] nextGreater(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] next = new int[arr.length];

        for(int i = arr.length - 1; i >= 0; i --) {
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            if(st.isEmpty()) {
                next[i] = -1;
            } else {
                next[i] = arr[st.peek()];

            }
            st.push(i);

        }
        return next;
    }

    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};

        System.out.print(Arrays.toString(nextGreater(arr)));


    }
}
