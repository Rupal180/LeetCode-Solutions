/*
 * GeeksForGeeks - Palindrome String
 *
 * Approach:
 * We use the Two Pointer approach.
 *
 * We maintain two pointers:
 *
 * left  -> starts from the beginning of the string
 * right -> starts from the end of the string
 *
 * 1. Compare the characters at left and right.
 * 2. If they are different, the string is not a palindrome.
 * 3. Move left forward and right backward.
 * 4. Continue until left crosses or meets right.
 * 5. If all corresponding characters are equal, the string
 *    is a palindrome.
 *
 * Example:
 * s = "madam"
 *
 * m == m
 * a == a
 * d == d
 *
 * Therefore, the string is a palindrome.
 *
 * Example:
 * s = "hello"
 *
 * h != o
 *
 * Therefore, the string is not a palindrome.
 *
 * Time Complexity: O(n)
 * We compare characters while traversing the string.
 *
 * Space Complexity: O(1)
 * We use only two pointers and no extra data structure.
 */

class Solution {

    boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}