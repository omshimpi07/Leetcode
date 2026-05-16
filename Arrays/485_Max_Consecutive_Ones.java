/*
485. Max Consecutive Ones
Given a binary array nums, return the maximum number of consecutive 1's in the array.

Example 1: Input: nums = [1,1,0,1,1,1] Output: 3 Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2: Input: nums = [1,0,1,1,0,1] Output: 2
Difficulty : easy

Approach:
1. Initialize two variables, one to count the current number of consecutive 1's and another to keep track of the maximum count found so far.
2. Iterate through the input array, and for each element:
   - If the element is 1, increment the current count of consecutive 1's and update the maximum count if necessary.
   - If the element is 0, reset the current count of consecutive 1's to 0.
3. After iterating through the array, return the maximum count of consecutive 1's found.

Time Complexity: O(n) where n is the length of the input array, since we are iterating through the array once.
Space Complexity: O(1) since we are using only a constant amount of extra space to
*/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int one = 0;
        int max = 0;
        
        for(int i = 0; i<nums.length;i++){
            
            if(nums[i] == 1){
                one++;
                max = Math.max(max,one);
            }
            else{
                one = 0;
            }
        }
        return max;
    }
}