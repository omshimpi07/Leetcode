/*
747. Largest Number At Least Twice of Others
You are given an integer array nums where the largest integer is unique.
Determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, return the index of the largest element, or return -1 otherwise.

Example 1:
Input: nums = [3,6,1,0] Output: 1
Explanation: 6 is the largest integer.
For every other number in the array x, 6 is at least twice as much as x. The index of value 6 is 1, so we return 1.

Example 2:
Input: nums = [1,2,3,4] Output: -1
Explanation: 4 is less than twice the value of 3, so we return -1

Example 3:
Input: nums = [1] Output: 0
Explanation: 1 is the largest integer. There are no other numbers in the array, so
we return the index of the largest element, which is 0. The largest element in nums is unique.

Difficulty: Easy
Approach:
1. Iterate through the array to find the largest element and its index.
2. Iterate through the array again to check if the largest element is at least twice as much as every other number.
3. If any number is found that is not less than half of the largest element, return -1.
4. If the loop completes without finding such a number, return the index of the largest element.
Time Complexity: O(n)
Space Complexity: O(1)
 */



class Solution {
    public int dominantIndex(int[] nums) {
        
        int largest = 0;
        
        int index = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] > largest){
                largest = nums[i];  
                index = i;
            }
        }
        for(int j = 0; j<nums.length;j++){
                if(j != index && largest < 2*nums[j]){
                    return -1;
                }
        }
        return index;
    }
}