/*
 * LeetCode #53 - Maximum Subarray
 *
 * Approach:
 * We use Kadane's Algorithm.
 *
 * We keep two variables:
 * - sum: stores the sum of the current subarray.
 * - maxSum: stores the maximum sum found so far.
 *
 * For each element:
 * 1. Add it to sum.
 * 2. If sum is greater than maxSum, update maxSum.
 * 3. If sum becomes negative, reset sum to 0 because a negative
 *    sum will decrease the sum of any future subarray.
 *
 * Example:
 * nums = [2, 3, 5, -2, 7, -4]
 *
 * Maximum subarray = [2, 3, 5, -2, 7]
 * Maximum sum = 15
 *
 * Time Complexity: O(n)
 * We traverse the array only once.
 *
 * Space Complexity: O(1)
 * We use only two variables.
 */

class Solution {

    public int maxSubArray(int[] nums) {

        int maxSum = nums[0];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (sum > maxSum) {
                maxSum = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        return maxSum;
    }
}