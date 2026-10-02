/*
 * LeetCode #66 - Plus One
 *
 * Approach:
 * We start from the last digit because addition starts from the right.
 *
 * 1. Traverse the array from right to left.
 * 2. If the current digit is less than 9, increment it by 1
 *    and return the array.
 * 3. If the current digit is 9, make it 0 and continue
 *    to the previous digit.
 * 4. If all digits were 9, create a new array of size n + 1
 *    and put 1 at the first position.
 *
 * Example:
 * digits = [1, 2, 9]
 *
 * 9 becomes 0 and carry moves left:
 * [1, 2, 0]
 *
 * 2 becomes 3:
 * [1, 3, 0]
 *
 * Result = [1, 3, 0]
 *
 * Example:
 * digits = [9, 9]
 *
 * 9 → 0
 * 9 → 0
 *
 * All digits were 9, so create a new array:
 * [1, 0, 0]
 *
 * Time Complexity: O(n)
 * In the worst case, we traverse all digits.
 *
 * Space Complexity: O(n)
 * In the worst case, we create a new array of size n + 1.
 */

class Solution {

    public int[] plusOne(int[] digits) {

        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];

        result[0] = 1;

        return result;
    }
}