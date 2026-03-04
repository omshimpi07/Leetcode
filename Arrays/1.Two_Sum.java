/*
1. Two Sum
Given an array of integers nums and an integer target, return indices of the two numbers such that
they add up to target.  
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]

Difficulty: Easy

Approach:
1. Use a brute-force approach by checking all pairs of numbers in the array to see if they add up to the target. This can be done using two nested loops.
2. The outer loop iterates through each element in the array, while the inner loop checks
the subsequent elements to find a pair that sums up to the target.
Time Complexity: O(n^2)
Space Complexity: O(1)

*/




class Solution {
    public int[] twoSum(int[] nums, int target) {

            for(int i = 0 ; i< nums.length;i++){

                for(int j = i+1;j<nums.length;j++){

                    if(nums[i] + nums[j] == target){

                        return new int[]{i, j};
                        
                    }
                }
            }
            return null;
    }
}