package com.janhavi.ArrayProblems;
import java.util.HashSet;


public class Unique {

        public static int countNumbersWithUniqueDigits(int n) {
            // Handle edge cases
            if (n < 0 || n > 10) {
                return 0;
            }
            if (n == 0) {
                return 1;
            }

            int count = 1; // count 0

            // Loop through all possible numbers with unique digits
            for (int i = 1; i < Math.pow(10, n); i++) {
                HashSet<Integer> digits = new HashSet<>();
                int num = i;

                // Check if the number has unique digits
                while (num > 0) {
                    int digit = num % 10;
                    if (digits.contains(digit)) {
                        break;
                    }
                    digits.add(digit);
                    num /= 10;
                }
                if (num == 0) {
                    count++;
                }
            }

            return count;
        }

        public static void main(String[] args) {
            int n = 3;
            int count = countNumbersWithUniqueDigits(n);
            System.out.println("Count of numbers with unique digits from 0 to 10^" + n + " - 1: " + count);
        }
    }


