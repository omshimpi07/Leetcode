 /*
    217. Contains Duplicate
    Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

    Example 1:
    Input: nums = [1,2,3,1]
    Output: true
    Example 2:
    Input: nums = [1,2,3,4]
    Output: false
    Example 3:
    Input: nums = [1,1,1,3,3,4,3,2,4,2]
    Output: true
    Difficulty: Easy    
    Approach:
    1. Simpe Nested Loop: Compare each element with every other element to check for duplicates.
    Time Complexity: O(n^2)
    Space Complexity: O(1)

  */

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        int temp = 0;
        boolean value = false;
        
        for(int i = 0; i<nums.length;i++){

            if( temp == nums[i] ){
                value = true;
            }
            temp = nums[i];
            
            for(int j = i+1;j< nums.length;j++){

                if(temp == nums[j]){
                    value = true;
                }  
            }
        }
        return value;

    }
}