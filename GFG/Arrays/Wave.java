package GFG.Arrays;
/*
 * GeeksForGeeks - Wave Array
 *
 * Approach:
 * We use the Wave Array approach by swapping adjacent elements.
 *
 * A wave array follows the pattern:
 * arr[0] >= arr[1] <= arr[2] >= arr[3] ...
 *
 * 1. Traverse the array in steps of 2.
 * 2. Swap arr[i] with arr[i+1].
 * 3. This creates a wave-like pattern.
 *
 * Example:
 * arr = [1, 2, 3, 4, 5, 6]
 *
 * Swap index 0 and 1:
 * [2, 1, 3, 4, 5, 6]
 *
 * Swap index 2 and 3:
 * [2, 1, 4, 3, 5, 6]
 *
 * Swap index 4 and 5:
 * [2, 1, 4, 3, 6, 5]
 *
 * Result:
 * [2, 1, 4, 3, 6, 5]
 *
 * The array follows the wave pattern:
 * 2 >= 1 <= 4 >= 3 <= 6 >= 5
 *
 * Time Complexity: O(n)
 * We traverse the array in pairs.
 *
 * Space Complexity: O(1)
 * We use only one temporary variable for swapping.
 */

class Solution {

    public void sortInWave(int arr[]) {

        for (int i = 0; i < arr.length - 1; i += 2) {

            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
}
