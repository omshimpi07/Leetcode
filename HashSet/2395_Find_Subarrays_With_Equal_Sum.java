/*
2395. Find Subarrays With Equal Sum

Given a 0-indexed integer array nums, determine whether there exist two subarrays of length 2 with equal sum. Note that the two subarrays must begin at different indices.
Return true if these subarrays exist, and false otherwise.
A subarray is a contiguous non-empty sequence of elements within an array.

Example 1: Input: nums = [4,2,4] Output: true
Explanation: The subarrays with elements [4,2] and [2,4] have the same sum of 6.

Difficlty : Easy

*/

class Solution {
    public boolean findSubarrays(int[] nums) {
        
        HashSet<Long> set = new HashSet<>();

        for (int i = 0; i < nums.length - 1; i++) {
            long sum = (long) nums[i] + nums[i + 1];

            if (set.contains(sum)) {
                return true;
            }

            set.add(sum);
        }

        return false;
    }
}