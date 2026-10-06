/*
 * GeeksForGeeks - Change the Case
 *
 * Approach:
 * We check the case of the first character of the string.
 *
 * 1. If the first character is uppercase, convert the complete
 *    string to uppercase.
 * 2. Otherwise, convert the complete string to lowercase.
 *
 * Example:
 * s = "Hello"
 *
 * First character = 'H'
 * 'H' is uppercase.
 *
 * Therefore:
 * "Hello" -> "HELLO"
 *
 * Example:
 * s = "hello"
 *
 * First character = 'h'
 * 'h' is lowercase.
 *
 * Therefore:
 * "hello" -> "hello"
 *
 * Time Complexity: O(n)
 * Converting the complete string requires traversing its characters.
 *
 * Space Complexity: O(n)
 * toUpperCase() or toLowerCase() creates a new String.
 */

class Solution {

    String modify(String s) {

        if (Character.isUpperCase(s.charAt(0))) {
            return s.toUpperCase();
        }
        else {
            return s.toLowerCase();
        }
    }
}