
/*
 * LeetCode #75 - Sort Colors
 *
 * Approach:
 * We use the Dutch National Flag algorithm (Three Pointer approach).
 *
 * We maintain three pointers:
 *
 * low  -> position where the next 0 should be placed
 * mid  -> current element being checked
 * high -> position where the next 2 should be placed
 *
 * The array is divided into three regions:
 *
 * 0s | 1s | Unprocessed | 2s
 *
 * 1. If nums[mid] == 0:
 *    Swap nums[low] and nums[mid].
 *    Increment both low and mid.
 *
 * 2. If nums[mid] == 1:
 *    1 is already in its correct region.
 *    Just increment mid.
 *
 * 3. If nums[mid] == 2:
 *    Swap nums[mid] and nums[high].
 *    Decrement high.
 *    We do NOT increment mid because the swapped element
 *    from high still needs to be checked.
 *
 * Example:
 * nums = [2, 0, 2, 1, 1, 0]
 *
 * After applying the three pointer approach:
 * [0, 0, 1, 1, 2, 2]
 *
 * Time Complexity: O(n)
 * Each element is processed at most a constant number of times.
 *
 * Space Complexity: O(1)
 * We sort the array in-place using only constant extra space.
 */

class Solution {

    public void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {

                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            }

            else if (nums[mid] == 1) {
                mid++;
            }

            else {

                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }
}