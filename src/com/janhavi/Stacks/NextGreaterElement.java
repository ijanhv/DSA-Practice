package com.janhavi.Stacks;

import  java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static int[] findNextGreater(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i --) {
            while(!st.isEmpty() && arr[i] >= arr[st.peek()] ) {
                st.pop();
            }
            if(st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = arr[st.peek()];
            }

            st.push(i);
        }

        return ans;

    }
    public static void main(String[] args) {
        int[] arr = { 6, 8, 0, 1, 3 };
        int[] result = findNextGreater(arr);
        System.out.print(Arrays.toString(result));


    }
}
