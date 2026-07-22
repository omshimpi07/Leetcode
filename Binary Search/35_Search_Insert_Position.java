/*
35. Search Insert Position
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.

Example 1: Input: nums = [1,3,5,6], target = 5 Output: 2
Example 2: Input: nums = [1,3,5,6], target = 2 Output: 1
Example 3: Input: nums = [1,3,5,6], target = 7 Output: 4

Difficulty : easy

Approach : Binary Search.
1. Initialize two pointers, left and right, to the start and end of the array, respectively.
2. While left is less than or equal to right:
    a. Calculate the middle index mid as left + (right - left) / 2.
    b. If nums[mid] is equal to the target, return mid.
    c. If nums[mid] is greater than the target, move the right pointer to mid - 1.
    d. If nums[mid] is less than the target, move the left pointer to mid + 1.
3. If the target is not found, return the left pointer, which will be the index where the target should be inserted.    

Time Complexity: O(log n) where n is the number of elements in the array, since we are performing a binary search.
Space Complexity: O(1) since we are using a constant amount of space for the pointers

*/

class Solution {
    public int searchInsert(int[] nums, int target) {
        
        // int index = -1;
        // for(int i = 0; i<nums.length;i++){

        //     if(nums[i] == target){
        //         index = i;
        //     }

        // }
        // if(index == -1){
        //     for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] >= target) {
        //         return i;
        //     }
        // }

        // return nums.length;
        // }
        // return index;

        int left = 0;
        int right = nums.length-1;
        int mid = 0;
        while(left <= right){

            mid = left + (right - left)/2;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] > target){
                
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
            
        }
        return left;

    }
}