/*
1984. Minimum Difference Between Highest and Lowest of K Scores

You are given a 0-indexed integer array nums, where nums[i] represents the score of the ith student. You are also given an integer k.
Pick the scores of any k students from the array so that the difference between the highest and the lowest of the k scores is minimized.
Return the minimum possible difference.

Example 1: Input: nums = [90], k = 1 Output: 0
Explanation: There is one way to pick score(s) of one student:
- [90]. The difference between the highest and lowest score is 90 - 90 = 0.
The minimum possible difference is 0.

Difficulty : easy

*/

class Solution {
    public int minimumDifference(int[] nums, int k) {
        
        int difference = 0;
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);

        for(int i = 0; i <=nums.length - k ; i++){

            difference = nums[i + k - 1] - nums[i];
            min = Math.min(min , difference);
        }

        return min;

    }
}