/*
334. Increasing Triplet Subsequence
Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.

Example 1: Input: nums = [1,2,3,4,5] Output: true Explanation: Any triplet where i < j < k is valid. For example, (1, 2, 3), (2, 4, 5) and (1, 3, 5).      
Example 2: Input: nums = [5,4,3,2,1] Output: false Explanation: No triplet exists.
Example 3: Input: nums = [2,1,5,0,4,6] Output: true Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.

Difficulty : medium

Approach:
1. Initialize two variables, first and second, to store the smallest and second smallest numbers found so far. Set them to Integer.MAX_VALUE initially.
2. Iterate through the input array nums:
   a. If the current number is less than or equal to first, update first to be the current number.
   b. Else if the current number is less than or equal to second, update second to be the current number.
   c. Else, if the current number is greater than both first and second, it means we have found a triplet (first, second, current number), so return true.
3. If the loop ends and we haven't found a triplet, return false.
Time Complexity: O(n) where n is the length of the input array.
Space Complexity: O(1) since we are using only a constant amount of extra space for the variables first and second.

*/

class Solution {
    public boolean increasingTriplet(int[] nums) {
        
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i =  0 ; i<nums.length ; i++){
            
            if (nums[i] <= first){
                first = nums[i];
            }
            else if (nums[i] <= second){
                second = nums[i];
            }  
            else{
                return true;
            } 
        }
        return false;
    }
}