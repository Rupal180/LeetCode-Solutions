/*
 * LeetCode #1 - Two Sum
 *
 * Approach:
 * We use two loops to check every possible pair of numbers.
 *
 * - The first loop selects one number.
 * - The second loop checks the numbers after it.
 * - If the sum of the two numbers is equal to the target,
 *   we return the indices of those two numbers.
 *
 * Example:
 * nums = [2, 7, 11, 15], target = 9
 *
 * 2 + 7 = 9
 * So, the answer is [0, 1].
 *
 * Time Complexity: O(n^2)
 * We use two nested loops, so we may check every possible pair.
 *
 * Space Complexity: O(1)
 * We don't use any extra data structure.
 */

class Solution {

    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        return new int[] {};
    }
}