package com.janhavi.ArrayProblems;

public class MaximumIndex {
    static void maximumIndex(int N, int B)
    {

        // Initialize two pointers
        int i = 0, j = 1;

        // Stores number of steps
        int cnt = 0;

        // Stores sum of first N
        // natural numbers
        int sum = N * (N + 1) / 2;

        boolean flag = false;

        while (cnt < N)
        {

            // Increment i with j
            i += j;

            // Increment j with 1
            j++;

            // Increment count
            cnt++;

            // If i points to B
            if (i == B)
            {

                // Break
                flag = true;
                break;
            }
        }

        // Print the pointer index
        if (!flag == true)
        {
            System.out.print(sum);
        }
        else
        {
            System.out.print(sum - 1);
        }
    }

    public static void main(String[] args) {
        int N = 4, B = 6;

        // Function call to find maximum
        // index the pointer can reach
        maximumIndex(N, B);
    }

}
