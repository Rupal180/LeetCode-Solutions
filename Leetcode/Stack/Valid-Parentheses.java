
/*
 * LeetCode #20 - Valid Parentheses
 *
 * Approach:
 * We use a Stack.
 *
 * We use a Stack because parentheses must close in
 * the reverse order in which they are opened (LIFO).
 *
 * Logic:
 * For every character:
 * 1. If it is an opening bracket ('(', '{', '['),
 *    push it into the stack.
 *
 * 2. If it is a closing bracket:
 *    - Check if the stack is empty. If yes, return false.
 *    - Pop the top element from the stack.
 *    - Check whether it matches the current closing bracket.
 *    - If it does not match, return false.
 *
 * 3. After traversing the string, check whether the
 *    stack is empty. If yes, return true; otherwise false.
 *
 * Example:
 * s = "{[]}"
 *
 * Stack operations:
 * '{' -> Push
 * '[' -> Push
 * ']' -> Pop '['
 * '}' -> Pop '{'
 *
 * Output = true
 *
 * Time Complexity: O(n)
 * We traverse the string only once.
 *
 * Space Complexity: O(n)
 * In the worst case, the stack stores all opening brackets.
 */

class Solution {

    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
            else {

                if (st.isEmpty()) {
                    return false;
                }

                char top = st.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {

                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}
