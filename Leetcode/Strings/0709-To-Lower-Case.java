package Leetcode.Strings;

/*
 * LeetCode #709 - To Lower Case
 *
 * Approach:
 * We use Java's built-in toLowerCase() method
 * to convert the entire string into lowercase.
 *
 * Example:
 * Input:  "Hello"
 * Output: "hello"
 *
 * Time Complexity: O(n)
 * - The method checks/converts each character of the string.
 *
 * Space Complexity: O(n)
 * - A new String may be created because Strings are immutable in Java.
 */

class Solution {
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }
}