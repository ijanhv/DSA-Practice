package com.janhavi.binarySearch;

public class RotatedArray {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2};
        System.out.print(findPivot(arr));
    }

    static int search(int[] arr, int target) {
        int pivot = findPivot(arr);
        //if no pivot, array is not rotated
        if(pivot == -1) {
            //do normal binary search
            return binarySearch(arr, target, 0, arr.length -1);
        }
        if(arr[pivot] == target) {
            return pivot;
        }

        if(target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        } else {
            return binarySearch(arr, target, pivot + 1, arr.length -1);
        }
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    static int findPivot(int [] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if(mid > start && arr[mid - 1] > arr[mid]) {
                return mid-1;
            }
            if(arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }


    static int findPivotWithDuplicates(int [] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if(mid > start && arr[mid - 1] > arr[mid]) {
                return mid-1;
            }

            //if elements at middle, start and end are equal then just skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                //check if start is pivot
                if(arr[start] > arr[start + 1]) {
                    return start;
                }
                start ++;
                if(arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end --;
            }
        }
        return -1;
    }
}
