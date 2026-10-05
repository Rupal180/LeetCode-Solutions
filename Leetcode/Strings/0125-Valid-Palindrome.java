/*
 * LeetCode #125 - Valid Palindrome
 *
 * Approach:
 * We use the Two Pointer approach.
 *
 * We maintain two pointers:
 * low  -> starts from the beginning
 * high -> starts from the end
 *
 * 1. Skip non-alphanumeric characters from both sides.
 * 2. Convert characters to lowercase before comparing.
 * 3. If the characters are different, return false.
 * 4. Move low forward and high backward.
 * 5. If all characters match, return true.
 *
 * Example:
 * s = "A man, a plan, a canal: Panama"
 *
 * After ignoring spaces and special characters:
 * "amanaplanacanalpanama"
 *
 * The string is a palindrome.
 *
 * Time Complexity: O(n)
 * We traverse the string using two pointers.
 *
 * Space Complexity: O(1)
 * No extra string or data structure is used.
 */

class Solution {

    public boolean isPalindrome(String s) {

        int low = 0;
        int high = s.length() - 1;

        while (low < high) {

            while (low < high &&
                   !Character.isLetterOrDigit(s.charAt(low))) {
                low++;
            }

            while (low < high &&
                   !Character.isLetterOrDigit(s.charAt(high))) {
                high--;
            }

            if (Character.toLowerCase(s.charAt(low)) !=
                Character.toLowerCase(s.charAt(high))) {
                return false;
            }

            low++;
            high--;
        }

        return true;
    }
}