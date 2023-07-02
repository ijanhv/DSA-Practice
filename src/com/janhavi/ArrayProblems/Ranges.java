package com.janhavi.ArrayProblems;
import java.io.*;
import java.util.*;

public class Ranges {
    static int countUniqueNumbers(List<List<Integer>> range) {
        int count = 0;

        for (List<Integer> pair : range) {
            int l = pair.get(0);
            int r = pair.get(1);

            // Start traversing the numbers
            for (int i = l; i <= r; i++) {
                int num = i;
                boolean[] visited = new boolean[10];

                // Find digits and maintain its hash
                while (num != 0) {
                    // if a digit occurs more than 1 time
                    // then break
                    if (visited[num % 10])
                        break;

                    visited[num % 10] = true;

                    num = num / 10;
                }

                // num will be 0 only when above loop
                // doesn't get break that means the
                // number is unique so increment count.
                if (num == 0)
                    count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        List<List<Integer>> range = new ArrayList<>();
        range.add(Arrays.asList(80, 120));

        int count = countUniqueNumbers(range);
        System.out.println(count); // 19
    }
    }



