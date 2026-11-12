"""
3105. Longest Strictly Increasing or Strictly Decreasing Subarray

You are given an array of integers nums. Return the length of the longest subarray of nums which is either strictly increasing or strictly decreasing.

Example 1: Input: nums = [1,4,3,3,2] Output: 2

Explanation:
The strictly increasing subarrays of nums are [1], [2], [3], [3], [4], and [1,4].
The strictly decreasing subarrays of nums are [1], [2], [3], [3], [4], [3,2], and [4,3].
Hence, we return 2.

"""

class Solution:
    def longestMonotonicSubarray(self, nums: List[int]) -> int:
        inc = 1
        dec = 1
        max_len = 1

        for i in range(1, len(nums)):

            if nums[i] > nums[i - 1]:
                inc += 1
            else:
                inc = 1

            if nums[i] < nums[i - 1]:
                dec += 1
            else:
                dec = 1

            max_len = max(max_len, max(inc, dec))

        return max_len