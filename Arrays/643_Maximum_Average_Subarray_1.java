/*
643. Maximum Average Subarray I
Given an array consisting of n integers, find the contiguous subarray of given length k that has the maximum average value. And you need to output the maximum average value.

Example 1: Input: nums = [1,12,-5,-6,50,3], k = 4 Output: 12.75000
Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75
Example 2: Input: nums = [5], k = 1 Output: 5.00000

Difficulty : easy

Approach:
1. Use a sliding window of size k to calculate the sum of the first k elements in the array.
2. Initialize a variable maxSum to store the maximum sum found so far, and set it               
to the sum of the first k elements.
3. Iterate through the array starting from the k-th element, and for each element, update
the sum by subtracting the element that is sliding out of the window and adding the new element that is sliding into the window.
4. Update maxSum if the new sum is greater than the current maxSum.
5. After iterating through the array, return the maximum average by dividing maxSum by k.
Time Complexity: O(n) where n is the length of the input array, since we are iterating through the array once.
Space Complexity: O(1) since we are using only a constant amount of extra space to

*/
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int sum = 0;
        for(int i = 0; i<k ; i++){
            sum += nums[i];
        }
        int maxsum = sum;
        for(int i = k; i< nums.length ;i++){
            sum = sum - nums[i-k] + nums[i];
            maxsum = Math.max(maxsum,sum);
        }
        return (double)maxsum/k;
    }
}