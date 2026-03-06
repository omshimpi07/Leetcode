/*
704. Binary Search
Given an array of integers nums which is sorted in ascending order, and an integer target, write
a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
Example 1:
Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4

Example 2:
Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1
Example 3:
Input: nums = [-1,0,3,5,9,12], target = 3
Output: 2
Explanation: 3 exists in nums and its index is 2
Constraints:
1 <= nums.length <= 10^4
-10^4 < nums[i], target < 10^4
All the integers in nums are unique.
Difficulty: Easy

Approach:
1. Use binary search to find the target in the sorted array.
2. Initialize two pointers, start and end, to the beginning and end of the array, respectively.
3. While start is less than or equal to end, calculate the mid index and compare the

target with the middle element. If they match, return the mid index. If the target is less than the middle element, move the end pointer to mid - 1. If the target is greater than the middle element, move the start pointer to mid + 1.
Time Complexity: O(log n)
Space Complexity: O(1)

*/



class Solution {
    public int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = (start + end )/2 ;
            if(target == nums[mid]){
                return mid;
            }
            else if(target < nums[mid]){
                end = mid -1;
            }
            else{
                start = mid + 1; 
            }
        }
        return -1;
    }

}