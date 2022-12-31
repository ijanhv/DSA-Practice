package com.janhavi.Queue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindow {

    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        Deque<Integer> dq = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        int i;
        for(i = 0; i < k; i++) {
            while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }

        for(; i < n; i++) {
            ans.add(arr[dq.peek()]);

            while(!dq.isEmpty() && dq.peek() <= i-k) {
                dq.removeFirst();
            }

            while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.removeLast();
            }

            dq.addLast(i);
        }

        ans.add(arr[dq.peek()]);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 3;

        System.out.print(max_of_subarrays(arr, arr.length, 3));
    }
}
