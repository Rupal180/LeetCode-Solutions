/*
 * LeetCode #283 - Move Zeroes
 *
 * Approach:
 * We use the Two Pointer approach.
 *
 * We maintain a pointer j that tells us where the next
 * non-zero element should be placed.
 *
 * 1. Traverse the array using pointer i.
 * 2. Whenever nums[i] is not zero, put it at nums[j].
 * 3. Increment j.
 * 4. After all non-zero elements are placed, fill the
 *    remaining positions with zero.
 *
 * Example:
 * nums = [0, 1, 0, 3, 12]
 *
 * After moving non-zero elements:
 * [1, 3, 12, _, _]
 *
 * Fill the remaining positions with zero:
 * [1, 3, 12, 0, 0]
 *
 * The relative order of non-zero elements is maintained.
 *
 * Time Complexity: O(n)
 * We traverse the array a constant number of times.
 *
 * Space Complexity: O(1)
 * We use only one extra pointer.
 */

class Solution {

    public void moveZeroes(int[] nums) {

        int j = 0;

        // Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        // Fill the remaining positions with zero
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
    }
}