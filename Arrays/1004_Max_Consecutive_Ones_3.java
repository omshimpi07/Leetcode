/*
1004. Max Consecutive Ones III
Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
Example 1: Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2 Output: 6 Explanation: Flip the second and third zero will get the maximum number of consecutive 1's. After flipping, the maximum number of consecutive 1's is 6.
Example 2: Input: nums = [0,0,1,1,1,0,0], k = 0 Output: 3 Explanation: The first three digits or the middle three digits are consecutive 1's. The maximum number of consecutive 1's is 3.

Difficulty : medium

Approach:
1. Use a sliding window approach to keep track of the number of 0's in the current window of 1's.
2. Initialize two pointers, left and right, to represent the current window of 1's and a variable to count the number of 0's in the current window.
3. Iterate through the input array with the right pointer, and for each element:
    - If the element is 0, increment the count of 0's in the current window.
    - If the count of 0's exceeds k, move the left pointer to the right until the count of 0's is at most k again.
    - Update the maximum length of consecutive 1's found so far.
4. After iterating through the array, return the maximum length of consecutive 1's found.

Time Complexity: O(n) where n is the length of the input array, since we are iterating through the array once.
Space Complexity: O(1) since we are using only a constant amount of extra space to store the count of 0's and the maximum length of consecutive 1's.

*/
class Solution {
    public int longestOnes(int[] nums, int k) {
  
        int zero = 0;
        int left = 0;
        int maxlen = 0;

        for(int right = 0;right < nums.length;right++){

            if(nums[right] == 0){
                zero++;
            }
            while(zero > k){
                if(nums[left] == 0){
                    zero--;
                }
                left++;
            }
            maxlen = Math.max(maxlen ,right - left +1 );
        }
        return maxlen;
    }
}