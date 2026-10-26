/*
 * GeeksforGeeks - Anagram
 *
 * Approach:
 * 1. If the lengths of s1 and s2 are different, return false because
 *    anagrams must contain the same number of characters.
 * 2. Create a frequency array of size 26 to store character counts.
 * 3. Traverse both strings simultaneously:
 *    - Increment the frequency of each character in s1.
 *    - Decrement the frequency of each character in s2.
 * 4. Traverse the frequency array. If any frequency is not zero,
 *    the strings are not anagrams, so return false.
 * 5. If all frequencies are zero, return true.
 *
 * Example:
 * Input:  s1 = "listen", s2 = "silent"
 * Output: true
 *
 * Time Complexity: O(n)
 * - We traverse both strings and the frequency array.
 *
 * Space Complexity: O(1)
 * - The frequency array always contains 26 elements.
 */

class Solution {
    public static boolean areAnagrams(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        int[] freq = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
