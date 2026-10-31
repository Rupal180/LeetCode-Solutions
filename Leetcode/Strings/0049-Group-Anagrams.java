package Leetcode.Strings;

/*
 * Problem: Group Anagrams
 * Platform: LeetCode
 * Problem Number: 49
 *
 * Approach: HashMap + Frequency Count
 *
 * 1. Create a HashMap where the key represents the character
 *    frequency pattern and the value stores a list of anagrams.
 *
 * 2. Traverse each string in the input array.
 *
 * 3. Create a frequency array of size 26 to count occurrences
 *    of each lowercase English character.
 *
 * 4. Generate a unique key by appending all 26 frequencies
 *    separated by '#'.
 *
 * 5. Check whether the key already exists in the HashMap:
 *    - If yes, add the current string to the existing list.
 *    - If no, create a new list and insert it into the HashMap.
 *
 * 6. Finally, collect all the grouped anagrams and return them.
 *
 * Example:
 * Input:  ["eat", "tea", "tan", "ate", "nat", "bat"]
 * Output: [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]
 *
 * Time Complexity: O(n * k)
 * Space Complexity: O(n * k)
 *
 * n = Number of strings
 * k = Maximum length of a string
 */

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            String s = strs[i];
            int[] freq = new int[26];

            // Count frequency of each character
            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);
                freq[ch - 'a']++;
            }

            // Create unique key
            StringBuilder key = new StringBuilder();

            for (int j = 0; j < 26; j++) {
                key.append(freq[j]).append("#");
            }

            String k = key.toString();

            // Check whether key already exists
            if (map.containsKey(k)) {
                map.get(k).add(s);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(k, list);
            }
        }

        // Store all groups
        List<List<String>> result = new ArrayList<>();

        for (String key : map.keySet()) {
            result.add(map.get(key));
        }

        return result;
    }
}