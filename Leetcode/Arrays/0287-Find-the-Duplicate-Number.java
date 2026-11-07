/*
 * LeetCode #287 - Find the Duplicate Number
 *
 * Approach:
 * We use Floyd's Cycle Detection Algorithm.
 *
 * The idea is to treat the array like a linked list.
 * The value at nums[i] represents the next position to visit.
 *
 * Example:
 * nums = [1, 3, 4, 2, 2]
 *
 * 0 -> 1 -> 3 -> 2 -> 4
 *              ^    |
 *              |____|
 *
 * Since the number 2 is duplicated, it creates a cycle.
 *
 * Phase 1: Detect the cycle
 * - slow moves one step at a time.
 * - fast moves two steps at a time.
 * - If a cycle exists, slow and fast will eventually meet.
 *
 * Phase 2: Find the starting point of the cycle
 * - Reset slow to the starting position.
 * - Move both slow and fast one step at a time.
 * - They will meet at the entrance of the cycle.
 * - The cycle entrance is the duplicate number.
 *
 * Why does this work?
 * The duplicate value causes two different positions to point
 * to the same position. This creates a cycle in the linked-list
 * representation of the array.
 *
 * Time Complexity:
 * O(n)
 * Both phases take linear time:
 * O(n) + O(n) = O(n)
 *
 * Space Complexity:
 * O(1)
 * Only slow and fast pointers are used.
 */

class Solution {

    public int findDuplicate(int[] nums) {

        // Phase 1: Detect the cycle
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];          // Move one step
            fast = nums[nums[fast]];    // Move two steps
        } while (slow != fast);

        // Phase 2: Find the cycle entrance
        slow = nums[0];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }

    // Main method for testing in VS Code
    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {1, 3, 4, 2, 2};

        int result = obj.findDuplicate(nums);

        System.out.println("Duplicate number: " + result);
    }
}