package com.janhavi.ArrayProblems;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 4, 5, 5, 6};
        int[] nums2 = {2, 3, 5, 5, 7};
        List<Integer> intersection = IntersectionOfArrays(nums1, nums2);
        System.out.println("Intersection: " + intersection);

    }

    static List<Integer> IntersectionOfArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        List<Integer> intersection = new ArrayList<>();
        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] < nums2[j]) {
                i ++;
            } else if (nums2[j] < nums1[i]) {
                j ++;
            } else  {
                intersection.add(nums1[i]);
                i ++;
                j ++;
            }
        }
        return intersection;
    }

    static List<Integer> unionOfArrays(int[] nums1, int[] nums2) {
        List<Integer> union = new ArrayList<>();
        int i = 0;
        int j = 0;

        while(i < nums1.length && j < nums2.length) {
            
        }


        return union;

    }
}
