/*
1920. Build Array From Permutation
Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
a zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).

Example 1:Input: nums = [0,2,1,5,3,4] Output: [0,1,2,4,5,3]
Example 2: Input: nums = [5,0,1,2,3,4]  Output: [4,5,0,1,2,3]

Difficulty : easy

Approach : Array.
1. Create an array ans of the same length as nums.
2. Iterate through the indices of nums and for each index i, set ans[i] = nums[nums[i]].
3. Return the ans array.

Time Complexity: O(n) where n is the length of the nums array, since we are iterating through the array once.
Space Complexity: O(n) for the ans array that we are creating to store the result.

*/

class Solution {
    public int[] buildArray(int[] nums) {
        // int n = nums.length;

        // int[] ans = new int[n];

        // for (int i = 0; i < n; i++) {
        //     ans[i] = nums[nums[i]];
        // }

        // return ans;

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] + (nums[nums[i]] % n) * n;
        }

        for (int i = 0; i < n; i++) {
            nums[i] /= n;
        }

        return nums;
    }
}