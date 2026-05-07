/*
238. Product of Array Except Self
Given an array nums of n integers where n > 1,  return an array output such
that output[i] is equal to the product of all the elements of nums except nums[i].

Example: Input: [1,2,3,4] Output: [24,12,8,6]
Note: Please solve it without division and in O(n).  Follow up: Could you solve
it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)

Difficulty : medium

Approach:
1. Create an output array of the same length as the input array to store the results.           
2. Traverse the input array from left to right, and for each index i, calculate the product of all elements to the left of i and store it in the output array at index i.
3. Traverse the input array from right to left, and for each index i, calculate the product of all elements to the right of i and multiply it with the value already stored in the output array at index i.
4. Return the output array.     

Time Complexity: O(n) where n is the length of the input array.
Space Complexity: O(1) if we do not count the output array, otherwise O(n) for the output array.

*/

class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];
        ans[0] = 1;

        for(int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        int suffix = 1;

        for(int i = n - 1; i >= 0; i--) {

            ans[i] = ans[i] * suffix;

            suffix *= nums[i];
        }

        return ans;
    }
}