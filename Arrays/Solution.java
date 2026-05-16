/*
487. Max Consecutive Ones II
Given a binary array nums, return the maximum number of consecutive 1's in the array if
you can flip at most one 0.
Example 1: Input: nums = [1,0,1,1,0] Output: 4 Explanation: Flip the first zero will get the maximum number of consecutive 1's. After flipping, the maximum number of consecutive 1's is 4.
Example 2: Input: nums = [1,0,1,0,1] Output: 3 Explanation: Flip the second zero will get the maximum number of consecutive 1's. After flipping, the maximum number of consecutive 1's is 3.    
Difficulty : medium

Approach:
1. Use a sliding window approach to keep track of the number of 0's in the
current window of 1's.
2. Initialize two pointers, left and right, to represent the current window of 1's
and a variable to count the number of 0's in the current window.
3. Iterate through the input array with the right pointer, and for each element:
    - If the element is 0, increment the count of 0's in the current window.
    - If the count of 0's exceeds 1, move the left pointer to the right until the
      count of 0's is at most 1 again.
    - Update the maximum length of consecutive 1's found so far.
4. After iterating through the array, return the maximum length of consecutive 1's found.   
Time Complexity: O(n) where n is the length of the input array, since we are iterating through the array once.
Space Complexity: O(1) since we are using only a constant amount of extra space to store the count of 0's and the maximum length of consecutive 1's.

*/
public class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {

        int left = 0;
        int zero = 0;
        int maxlen = 0;
//487. Max Consecutive Ones 2
        for(int right = 0;right < nums.length;right++) {

            if(nums[right] == 0) {
                zero++;
            }

            while(zero > 1) {

                if(nums[left] == 0) {
                    zero--;
                }
                left++;
            }
            maxlen = Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {1,0,1,1,0};

        System.out.println(obj.findMaxConsecutiveOnes(nums));
    }
}