package Leetcode.Arrays;

/*
 * Problem: Remove Duplicates from Sorted Array
 * Platform: LeetCode
 *
 * Approach: Two Pointers
 *
 * 1. If the array is empty, return 0.
 * 2. Use two pointers, i and j, initially set to 0.
 * 3. Pointer j traverses the entire array.
 * 4. If nums[i] != nums[j], a new unique element is found.
 * 5. Increment i and place the new unique element at nums[i].
 * 6. Return i + 1 as the number of unique elements.
 *
 * Example:
 * Input:  nums = [1, 1, 2]
 * Output: 2
 * Modified array: [1, 2, ...]
 *
 * Time Complexity: O(n)
 * Auxiliary Space Complexity: O(1)
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int i = 0;
        int j = 0;

        while (j < nums.length) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }

        return i + 1;
    }
}