package com.janhavi.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class PrintSubsequenceArray {

    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        printSubSeq(0, new ArrayList<>(), arr);

    }

    static void printSubSeq(int index, ArrayList<Integer> ds, int[] arr) {
        if(index == arr.length) {
            System.out.println(ds);
            return;
        }

        ds.add(arr[index]);
        printSubSeq(index + 1, ds, arr);
        ds.remove(ds.size() - 1);
        printSubSeq(index + 1,ds , arr);





    }
}

