"""
2395. Find Subarrays With Equal Sum

Given a 0-indexed integer array nums, determine whether there exist two subarrays of length 2 with equal sum. Note that the two subarrays must begin at different indices.
Return true if these subarrays exist, and false otherwise.
A subarray is a contiguous non-empty sequence of elements within an array.

Example 1: Input: nums = [4,2,4] Output: true
Explanation: The subarrays with elements [4,2] and [2,4] have the same sum of 6.

Difficlty : Easy

"""

class Solution:
    def findSubarrays(self, nums: list[int]) -> bool:
        seen_sums = set()

        for i in range(len(nums) - 1):

            pair_sum = nums[i] + nums[i + 1]

            if pair_sum in seen_sums:
                return True

            seen_sums.add(pair_sum)

        return False