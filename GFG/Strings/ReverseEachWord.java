package GFG.Strings;

/*
 * Problem: Reverse Each Word in a Given String
 * Platform: GeeksforGeeks
 *
 * Approach:
 * 1. Use a StringBuilder named 'word' to store the current word.
 * 2. Traverse the string character by character.
 * 3. If the character is not a space, append it to 'word'.
 * 4. When a space is encountered, reverse the current word
 *    and append it to 'result'.
 * 5. Clear 'word' using setLength(0) to store the next word.
 * 6. After the loop, reverse and append the last word because
 *    it may not be followed by a space.
 * 7. Convert the result to a String and trim the outer spaces.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != ' ') {
                word.append(ch);
            } else {
                if (word.length() > 0) {
                    result.append(word.reverse());
                    result.append(' ');
                    word.setLength(0);
                }
            }
        }

        if (word.length() > 0) {
            result.append(word.reverse());
        }

        return result.toString().trim();
    }
}