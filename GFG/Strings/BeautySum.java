/*
 * GeeksforGeeks - Sum of Beauty of All Substrings
 *
 * Approach:
 * 1. Use an outer loop to select the starting index of each substring.
 * 2. Initialize a frequency array of size 26 for each starting index.
 * 3. Use an inner loop to extend the substring and update character frequencies.
 * 4. Traverse the frequency array to find the maximum and minimum
 *    non-zero character frequencies.
 * 5. Calculate beauty as max - min and add it to the total sum.
 *
 * Example:
 * Input:  s = "aabcb"
 * Output: 5
 *
 * Time Complexity: O(n^2)
 * - There are O(n^2) substrings.
 * - Checking 26 character frequencies takes constant time.
 *
 * Space Complexity: O(1)
 * - The frequency array always contains 26 elements.
 */

class Solution {
    public int beautySum(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int[] freq = new int[26];

            for (int j = i; j < s.length(); j++) {
                freq[s.charAt(j) - 'a']++;

                int max = 0;
                int min = Integer.MAX_VALUE;

                for (int k = 0; k < 26; k++) {
                    if (freq[k] > 0) {
                        max = Math.max(max, freq[k]);
                        min = Math.min(min, freq[k]);
                    }
                }

                sum += max - min;
            }
        }

        return sum;
    }
}