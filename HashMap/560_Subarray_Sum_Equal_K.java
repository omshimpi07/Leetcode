/*
560. Subarray Sum Equals K
Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
A subarray is a contiguous non-empty sequence of elements within an array.

Example 1:
Input: nums = [1,1,1], k = 2
Output: 2

Example 2:
Input: nums = [1,2,3], k = 3
Output: 2 
Difficulty : medium
*/

class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Initial prefix sum = 0 with 1 occurrence

        int preSum = 0, ans = 0;

        for (int i = 0; i < n; i++) {
            preSum += nums[i];

            // Check if (preSum - k) exists in the map
            if (map.containsKey(preSum - k)) {
                ans += map.get(preSum - k);
            }

            // Store prefix sum frequency
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }
        return ans;
   }
}