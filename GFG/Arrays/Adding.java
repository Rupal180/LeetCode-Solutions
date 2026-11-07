package GFG.Arrays;
/*
 * GeeksForGeeks - Adding One
 *
 * Approach:
 * We use the Carry approach.
 *
 * We need to add 1 to a number represented by an array of digits.
 *
 * 1. Start from the last digit because addition begins from the right.
 * 2. Add the carry (initially 1) to the current digit.
 * 3. If the result is less than or equal to 9, store the result
 *    and set carry to 0.
 * 4. If the result is greater than 9, store 0 and keep carry as 1.
 * 5. After processing all digits, if carry is still 1,
 *    add 1 at the beginning.
 * 6. Reverse the result because digits are added from right to left.
 *
 * Example:
 * arr = [1, 2, 9]
 *
 * Start from the last digit:
 *
 * 9 + 1 = 10
 * Store 0 and carry = 1
 *
 * 2 + 1 = 3
 * Store 3 and carry = 0
 *
 * 1 + 0 = 1
 * Store 1
 *
 * Result before reversing:
 * [0, 3, 1]
 *
 * After reversing:
 * [1, 3, 0]
 *
 * Therefore, 129 + 1 = 130.
 *
 * Another example:
 * arr = [9, 9]
 *
 * 9 + 1 = 10 → 0, carry = 1
 * 9 + 1 = 10 → 0, carry = 1
 *
 * Carry is still 1, so add 1.
 *
 * Result = [1, 0, 0]
 *
 * Time Complexity: O(n)
 * We traverse all digits once and reverse the result.
 *
 * Space Complexity: O(n)
 * We use a Vector to store the result.
 */
import java.util.*;
import java.util.Collections;

class Solution {

    // Function for adding one to the number represented by the array
    Vector<Integer> addOne(int[] arr) {

        Vector<Integer> ans = new Vector<>();

        int n = arr.length;

        int carry = 1;

        for (int i = n - 1; i >= 0; i--) {

            if (arr[i] + carry <= 9) {
                ans.add(arr[i] + carry);
                carry = 0;
            }
            else {
                ans.add(0);
                carry = 1;
            }
        }

        if (carry == 1) {
            ans.add(1);
        }

        Collections.reverse(ans);

        return ans;
    }
}



// git add GFG/Arrays/Adding-One.java
// git commit -m "Adding One"
// git push