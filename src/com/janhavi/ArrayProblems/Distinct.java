package com.janhavi.ArrayProblems;
import java.io.*;
import java.util.*;
public class Distinct {
    private static boolean hasNoRepeatingDigits(int num) {
        // create a boolean array
        boolean[] digits = new boolean[10];
        // while num is greater than 0
        while (num > 0) {
            // get the last digit of the number
            int digit = num % 10;
            // if it is true at the index digit of the digits array
            if (digits[digit]) {
                // then return false
                return false;
            }
            // set true at index digit in digits array
            digits[digit] = true;
            // divide the num by 10 and assign to 10
            num /= 10;
        }
        return true;
    }

    static void countNumbers(List<List<Integer>> arr) {
        // declare integer variable named count
        int count;
        for (int i = 0; i < arr.size(); i++) {
            // set count to 0
            count = 0;
            // iterate over each number in the given range
            for (int n = arr.get(i).get(0); n <= arr.get(i).get(1); n++) {
                // if the number has non-repeating digits
                if(hasNoRepeatingDigits(n)){
                    // increase count by 1
                    count++;
                }
            }
            // finally print the count of numbers
            System.out.println(count);

        }
    }

    public static void main(String[] args) {
        // test the method by creating a list of lists and calling the method
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(80, 120));
        list.add(Arrays.asList(9, 19));

        // call the method countNumbers
        countNumbers(list);
    }
}
