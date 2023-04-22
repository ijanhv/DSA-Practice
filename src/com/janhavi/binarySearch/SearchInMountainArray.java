package com.janhavi.binarySearch;

public class SearchInMountainArray {
    public static void main(String[] args) {
        int[] arr = { 0,2,1,0};
        int ans = peakIndexInMountainArray(arr);
        System.out.print(ans);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return arr[start];
    }

    static int binarySearch(int[] arr, int start, int end, int target) {
        int mid = start + (end - start) / 2;

        while (start < end) {
            if(target == mid) {
                return mid;
            } else if (target > mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return -1;
    }
}
