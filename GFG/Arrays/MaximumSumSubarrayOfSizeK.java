package GFG.Arrays;

/**
 * GeeksForGeeks - Maximum Sum Subarray of Size K
 *
 * Approach:
 * We use the Sliding Window approach.
 *
 * We are given an array and an integer k.
 * We need to find the maximum sum of any
 * contiguous subarray of size k.
 *
 * Steps:
 * 1. Calculate the sum of the first k elements.
 * 2. Store this sum as the initial maximum sum.
 * 3. Slide the window one element at a time:
 *    - Remove the element leaving the window.
 *    - Add the new element entering the window.
 * 4. Update the maximum sum after each slide.
 * 5. Return the maximum sum.
 *
 * Example:
 * arr = [100, 200, 300, 400]
 * k = 2
 *
 * Initial window:
 * [100, 200] = 300
 *
 * Slide the window:
 * [200, 300] = 500
 * [300, 400] = 700
 *
 * Therefore, the maximum sum is 700.
 *
 * Time Complexity: O(n)
 * We traverse the array once.
 *
 * Space Complexity: O(1)
 * We use only constant extra space.
 */

class Solution {
    int maxSubarraySum(int[] arr, int k) {
        int windowSum = 0;
        // Calculate the sum of the first k elements
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        // Store the sum of the first window as maximum
        int maxSum = windowSum;
        // Slide the window across the remaining array
        for (int i = k; i < arr.length; i++) {
            // Remove the outgoing element and add the incoming element
            windowSum = windowSum - arr[i - k] + arr[i];

            // Update the maximum sum
            maxSum = Math.max(maxSum, windowSum);
        }
        // Return the maximum subarray sum
        return maxSum;
    }
}
