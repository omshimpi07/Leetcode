/*
977. Squares of a Sorted Array

Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

Example 1: Input: nums = [-4,-1,0,3,10] Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2: Input: nums = [-7,-3,2,3,11] Output: [4,9,9,49,121]
 
Difficulty : easy

Approach : Two Pointers.
1. Create an output array of the same length as the input array.
2. Initialize two pointers, left at the start of the array and right at the end of the array.
3. Iterate from the end of the output array to the beginning:
   a. Compare the absolute values of the elements at the left and right pointers.
   b. Square the larger absolute value and place it at the current index in the output array.
   c. Move the pointer (left or right) that had the larger absolute value inward (left++ or right--).
4. Continue this process until the left pointer exceeds the right pointer.

Time Complexity: O(n) where n is the length of the input array, since we are traversing the array once.
Space Complexity: O(n) for the output array storing the squared values.

*/

class Solution {
    public int[] sortedSquares(int[] nums) {
        

        // for(int i = 0; i < nums.length;i++){

        //     nums[i] = nums[i] * nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;

        int n = nums.length;

        int[] ans = new int[n];

        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while (left <= right) {

            if (Math.abs(nums[left]) > Math.abs(nums[right])) {

                ans[index] = nums[left] * nums[left];
                left++;

            } else {

                ans[index] = nums[right] * nums[right];
                right--;
            }

            index--;
        }

        return ans;
    }
}