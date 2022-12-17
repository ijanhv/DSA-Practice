package com.janhavi.Stacks;

import java.util.Stack;

public class MaxAreaInHistogram {
    public static int maxArea(int arr[]) {
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        //Next Smaller Right
        Stack<Integer> st = new Stack<>();

        for(int i = arr.length-1; i >= 0; i --) {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if(st.isEmpty()) {
                //-1
                nsr[i] = arr.length;
            } else {
                //nextGreater = st.peek()
                nsr[i] = st.peek();
            }

            st.push(i);
        }


        //Next Smaller Left
        st = new Stack<>();

        for(int i = 0; i < arr.length; i ++) {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if(st.isEmpty()) {
                //-1
                nsl[i] = -1;
            } else {
                //nextGreater = st.peek()
                nsl[i] = st.peek();
            }

            st.push(i);
        }


        //Current area : width = j - i - 1 or nsr[i] - nsl[i] - 1
        for(int i = 0; i < arr.length; i ++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 2, 3};
        System.out.println(maxArea(arr));
    }
}
