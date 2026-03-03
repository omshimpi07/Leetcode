/*
136. Single Number
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
Example 1:
Input: nums = [2,2,1]
Output: 1
Example 2:
Input: nums = [4,1,2,1,2]
Output: 4
Example 3:
Input: nums = [1]
Output: 1
Each element in the array appears twice except for one element which appears only once. 

Difficulty: Easy
Approach:
1. Use the XOR operator to find the single number. The XOR of a number with itself
is 0, and the XOR of a number with 0 is the number itself. Therefore, XORing all numbers in the array will cancel out the duplicates and leave the single number.
Time Complexity: O(n)
Space Complexity: O(1)


*/

class Solution {
    public int singleNumber(int[] nums) {
        
        int single = 0;
        for(int i = 0;i<nums.length;i++){
                single ^= nums[i];
        }
        return single;
    }
}