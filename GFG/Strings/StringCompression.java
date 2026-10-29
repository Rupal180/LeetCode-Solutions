/*
 * Problem: String Compression
 *
 * Approach:
 * 1. Convert the input string to lowercase so uppercase and lowercase
 *    characters are treated as the same.
 * 2. Use two pointers, i and j, to identify consecutive occurrences
 *    of the same character.
 * 3. The inner while loop moves j forward while the characters match.
 * 4. Calculate the frequency of the character using j - i.
 * 5. Append the character and its frequency to the result.
 * 6. Move i to j to process the next group of characters.
 *
 * Example:
 * Input:  "aaABBb"
 * Output: "a3b3"
 *
 * Time Complexity: O(n)
 * Auxiliary Space Complexity: O(n)
 */

class Solution {
    public String compressString(String s) {
        s = s.toLowerCase();

        StringBuilder result = new StringBuilder();
        int n = s.length();
        int i = 0;

        while (i < n) {
            char ch = s.charAt(i);
            int j = i + 1;

            while (j < n && s.charAt(j) == ch) {
                j++;
            }

            int count = j - i;

            result.append(ch);
            result.append(count);

            i = j;
        }

        return result.toString();
    }
}