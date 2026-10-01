package GFG.Arrays;

/*
 * GeeksForGeeks - Missing Number
 *
 * Approach:
 * We use the Sum Formula approach.
 *
 * The array contains numbers from 1 to N with one number missing.
 * Since the array has N-1 elements, we calculate N as arr.length + 1.
 *
 * 1. Calculate the expected sum of numbers from 1 to N.
 * 2. Subtract every element of the array from the expected sum.
 * 3. The remaining value is the missing number.
 *
 * Example:
 * arr = [1, 2, 4, 5]
 *
 * N = 5
 * Expected sum = 5 * 6 / 2 = 15
 *
 * Subtract array elements:
 * 15 - 1 - 2 - 4 - 5 = 3
 *
 * Therefore, the missing number is 3.
 *
 * We use long for sum to avoid integer overflow
 * when N is large.
 *
 * Time Complexity: O(n)
 * We traverse the array once.
 *
 * Space Complexity: O(1)
 * We use only constant extra space.
 */

class Solution {

    int missingNum(int arr[]) {

        int n = arr.length + 1;

        long sum = (long)n * (n + 1) / 2;

        for (int i = 0; i < arr.length; i++) {
            sum -= arr[i];
        }

        return (int)sum;
    }
}