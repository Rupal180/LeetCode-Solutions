/*
 * LeetCode #15 - 3Sum
 *
 * Approach:
 * 1. Sort the array.
 * 2. Fix one element using i.
 * 3. Use two pointers:
 *    - left = i + 1
 *    - right = nums.length - 1
 * 4. Calculate the sum of the three elements.
 * 5. If sum == 0, add the triplet to the answer.
 * 6. If sum < 0, move left forward.
 * 7. If sum > 0, move right backward.
 * 8. Skip duplicate values to avoid duplicate triplets.
 *
 * Example:
 * nums = [-1, 0, 1, 2, -1, -4]
 *
 * Output:
 * [[-1, -1, 2], [-1, 0, 1]]
 *
 * Time Complexity: O(n^2)
 * Sorting takes O(n log n), and the two-pointer search
 * takes O(n^2).
 *
 * Space Complexity: O(1) excluding the output.
 */

import java.util.*;

class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        // Sort the array
        Arrays.sort(nums);

        // Fix one element
        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate values of nums[i]
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {

                    // Add the valid triplet
                    ans.add(Arrays.asList(
                        nums[i],
                        nums[left],
                        nums[right]
                    ));

                    // Skip duplicate left values
                    while (left < right && nums[left] == nums[left + 1])
                        left++;

                    // Skip duplicate right values
                    while (left < right && nums[right] == nums[right - 1])
                        right--;

                    // Move both pointers
                    left++;
                    right--;

                } else if (sum < 0) {

                    // Need a bigger sum
                    left++;

                } else {

                    // Need a smaller sum
                    right--;
                }
            }
        }

        return ans;
    }

    // Main method for running in VS Code
    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> result = obj.threeSum(nums);

        System.out.println(result);
    }
}