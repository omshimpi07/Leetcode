/*
283. Move Zeroes
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zeroes.
Example 1: Input: nums = [0,1,0,3,12] Output: [1,3,12,0,0]
Example 2: Input: nums = [0] Output: [0]
Difficulty : easy
Approach:
1. Initialize a variable index to keep track of the position to place the next non-zero element.
2. Iterate through the input array nums:
   a. If the current element is not zero, swap it with the element at the index position and increment the index.       
3. After the loop, all non-zero elements will be moved to the front of the array, and the remaining elements will be zeros.
Time Complexity: O(n) where n is the length of the input array.
Space Complexity: O(1) since we are modifying the input array in place and using only a constant amount of extra space for the index variable.
*/

class Solution {
    public void moveZeroes(int[] nums) {

        int index = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {

                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;

                index++;
            }
        }
    }
}