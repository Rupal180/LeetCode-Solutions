/*
 * LeetCode #268 - Missing Number
 *
 * Approach:
 * We know that the array contains n distinct numbers from the range 0 to n,
 * with exactly one number missing.
 *
 * 1. Calculate the expected sum of numbers from 0 to n using:
 *      n * (n + 1) / 2
 *
 * 2. Subtract every number present in the array from the expected sum.
 *
 * 3. The number left in sum is the missing number.
 *
 * Example:
 * nums = [3, 0, 1]
 * n = 3
 *
 * Expected sum = 3 * 4 / 2 = 6
 * Actual sum   = 3 + 0 + 1 = 4
 *
 * Missing number = 6 - 4 = 2
 *
 * Time Complexity: O(n)
 * We traverse the array once.
 *
 * Space Complexity: O(1)
 * We use only a few variables and no extra data structure.
 */

class Solution {

    public int missingNumber(int[] nums) {

        int n = nums.length;

        long sum = (long) n * (n + 1) / 2;

        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
        }

        return (int) sum;
    }
}