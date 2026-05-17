/*
1493. Longest Subarray of 1's After Deleting One Element
Given a binary array nums, return the length of the longest subarray of 1's after deleting one element from the array.

Example 1: Input: nums = [1,1,0,1] Output: 3 Explanation: After deleting the second element (0), the subarray [1,1,1] is the longest subarray of 1's. Example 2: Input: nums = [0,1,1,1,0,1,1,0,1] Output: 5 Explanation: After deleting one of the zeros at positions 4 or 7, the longest subarray of 1's is [1,1,1,1,1]. Example 3: Input: nums = [1,1,1] Output: 2 Explanation: You must delete one element. Example 4: Input: nums = [0,0,0] Output: 0 Explanation: You must delete one element. Example 5: Input: nums = [0,0,1,0] Output: 0 Explanation: You must delete one element.
Difficulty : medium

Approach:
1. Use a sliding window approach to keep track of the number of 0's in the current window of 1's.
2. Initialize two pointers, left and right, to represent the current window of 1's and a variable to count the number of 0's in the current window.
3. Iterate through the input array with the right pointer, and for each element:
    - If the element is 0, increment the count of 0's in the current window.
    - If the count of 0's exceeds 1, move the left pointer to the right until the count of 0's is at most 1 again.
    - Update the maximum length of consecutive 1's found so far (note that we subtract one from the length to account for the deleted element).
4. After iterating through the array, return the maximum length of consecutive 1's found.
Time Complexity: O(n) where n is the length of the input array, since we are iterating through the array once.
Space Complexity: O(1) since we are using only a constant amount of extra space to
 */

class Solution {
    public int longestSubarray(int[] nums) {
        
        int left = 0;
        int zero = 0;
        int max = 0;

        for(int right = 0; right<nums.length;right++){

            if(nums[right] == 0){
                zero++;
            }
            if(zero > 1){
                if(nums[left] == 0 ){
                    zero--;
                }
                left++;
            }
            max = Math.max(max , right-left);
        }
        return max;
    }
}