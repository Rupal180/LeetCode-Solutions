/*
 * GeeksforGeeks - Maximum Occurring Character
 *
 * Approach:
 * 1. Create a frequency array of size 26 to store the frequency
 *    of each lowercase English character.
 * 2. Traverse the string and increment the frequency of each character
 *    using s.charAt(i) - 'a' as the array index.
 * 3. Traverse the frequency array to find the character with the
 *    maximum frequency.
 * 4. Update max and ans whenever a greater frequency is found.
 * 5. If multiple characters have the same maximum frequency,
 *    this code returns the lexicographically smallest character
 *    because we traverse the frequency array from 'a' to 'z'
 *    and update only when freq[i] > max.
 *
 * Example:
 * Input:  s = "output"
 * Output: 't'
 *
 * Time Complexity: O(n)
 * - We traverse the string once and the frequency array once.
 *
 * Space Complexity: O(1)
 * - The frequency array always has 26 elements.
 */

class Solution {
    public static char getMaxOccuringChar(String s) {
        int n = s.length();
        int[] freq = new int[26];

        for (int i = 0; i < n; i++) {
            freq[s.charAt(i) - 'a']++;
        }

        int max = 0;
        char ans = ' ';

        for (int i = 0; i < 26; i++) {
            if (freq[i] > max) {
                max = freq[i];
                ans = (char) (i + 'a');
            }
        }

        return ans;
    }
}