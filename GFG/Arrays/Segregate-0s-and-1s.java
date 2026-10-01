package GFG.Arrays;

/*
 * GeeksForGeeks - Segregate 0s and 1s
 *
 * Approach:
 * We use the Two Pointer approach.
 *
 * We maintain a pointer j that tells us where the next
 * zero should be placed.
 *
 * 1. Traverse the array using pointer i.
 * 2. Whenever arr[i] is 0, swap it with arr[j].
 * 3. Increment j.
 * 4. After traversal, all zeros will be on the left
 *    and all ones will be on the right.
 *
 * Example:
 * arr = [0, 1, 0, 1, 1, 0]
 *
 * After segregation:
 * [0, 0, 0, 1, 1, 1]
 *
 * Pointer i is used to traverse the array,
 * while j keeps track of the next position for 0.
 *
 * Time Complexity: O(n)
 * We traverse the array only once.
 *
 * Space Complexity: O(1)
 * We use only constant extra space.
 */

class Solution {

    void segregate0and1(int[] arr) {

        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }
    }
}