/*
 * LeetCode #53 - Maximum Subarray
 *
 * Approach:
 * We use Kadane's Algorithm.
 *
 * We maintain two variables:
 * 1. sum     -> stores the sum of the current subarray.
 * 2. maxSum  -> stores the maximum subarray sum found so far.
 *
 * Logic:
 * For every element:
 * 1. Add the current element to sum.
 * 2. Update maxSum if sum is greater than maxSum.
 * 3. If sum becomes negative, reset sum to 0 because
 *    a negative sum will decrease the sum of any future subarray.
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