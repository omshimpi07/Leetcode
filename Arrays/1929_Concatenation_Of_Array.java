/*
1929. Concatenation of Array

Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
Specifically, ans is the concatenation of two nums arrays.
Return the array ans.

Example 1: Input: nums = [1,2,1] Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]

Example 2: Input: nums = [1,3,2,1] Output: [1,3,2,1,1,3,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
- ans = [1,3,2,1,1,3,2,1]
 
Difficulty : easy

Approach : Array.
1. Create a new array ans of size 2n, where n is the length of the input array nums.
2. Iterate through the input array nums and for each index i, assign nums[i] to ans[i] and nums[i] to ans[i + n].
3. Return the new array ans after the loop completes.

Time Complexity: O(n) where n is the length of the input array nums, since we   
are iterating through the array once to fill the new array. 
Space Complexity: O(n) for the new array ans of size 2n.

*/
class Solution {
    public int[] getConcatenation(int[] nums) {

        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {

            ans[i] = nums[i];
            ans[i + n] = nums[i];

        }

        return ans;
    }
}