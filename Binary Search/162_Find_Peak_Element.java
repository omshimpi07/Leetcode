/*
 Find a Peak Element
A peak element is an element that is strictly greater than its neighbors.
Given an integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
You may imagine that nums[-1] = nums[n] = -∞.
You must write an algorithm that runs in O(log n) time.

Example 1: Input: nums = [1,2,3,1] Output: 2 Explanation: 3 is a peak element and your function should return the index number 2.
Example 2: Input: nums = [1,2,1,3,5,6,4] Output: 1 Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
Difficulty : medium

Approach : Binary Search.
1. Initialize two pointers, left and right, to the start and end of the array respectively.
2. While left is less than right:
   a. Calculate the mid index as the average of left and right.
   b. If the element at mid is less than the element at mid + 1, it means there is a peak element in the right half of the array, so move the left pointer to mid + 1.
   c. Otherwise, it means there is a peak element in the left half of the array (including mid), so move the right pointer to mid.
3. When left equals right, it means we have found a peak element, and we can return the index left (or right, since they are equal).

Time Complexity: O(log n) where n is the length of the input array, since we are performing a binary search. 
Space Complexity: O(1) since we are using a constant amount of space.
*/

class Solution {
    public int findPeakElement(int[] nums) {
        

        int left = 0;
        int right = nums.length-1;

        while(left < right){

            int mid = left + (right-left)/2;

            if(nums[mid] < nums[mid + 1]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return left;
    }
}