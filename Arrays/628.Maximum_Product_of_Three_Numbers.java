/*
Given an integer array nums, find three numbers whose product is maximum and return the maximum product.
Example 1:
Input: nums = [1,2,3]
Output: 6
Example 2:
Input: nums = [1,2,3,4]
Output: 24
Example 3:
Input: nums = [-1,-2,-3]
Output: -6

Difficulty: Medium
Approach:
1. Sort the array and calculate the product of the three largest numbers and the product of the two smallest numbers and the largest number. Return the maximum of these two products.
Time Complexity: O(n log n) due to sorting
Space Complexity: O(1) if we ignore the space used by the sorting algorithm, otherwise O(n) depending on the sorting implementation.
 */



class Solution {
    public int maximumProduct(int[] nums) {
        
        Arrays.sort(nums); 
        int n = nums.length;
        
        int p1 = nums[n-3]*nums[n-2]*nums[n-1];
        int p2 = nums[0]*nums[n-2]*nums[n-1];
        
        return Math.max(p1,p2);

    }
}