"""
2913. Subarrays Distinct Element Sum of Squares I

You are given a 0-indexed integer array nums.
The distinct count of a subarray of nums is defined as:
Let nums[i..j] be a subarray of nums consisting of all the indices from i to j such that 0 <= i <= j < nums.length. Then the number of distinct values in nums[i..j] is called the distinct count of nums[i..j].
Return the sum of the squares of distinct counts of all subarrays of nums.
A subarray is a contiguous non-empty sequence of elements within an array.

Example 1: Input: nums = [1,2,1] Output: 15
Explanation: Six possible subarrays are:
[1]: 1 distinct value
[2]: 1 distinct value
[1]: 1 distinct value
[1,2]: 2 distinct values
[2,1]: 2 distinct values
[1,2,1]: 2 distinct values
The sum of the squares of the distinct counts in all subarrays is equal to 12 + 12 + 12 + 22 + 22 + 22 = 15.

Difficulty: Medium

Approach:
1. Initialize a variable `total` to 0 to keep track of the sum of squares
2. Iterate through the array using two nested loops to generate all possible subarrays
3. For each subarray, use a set to keep track of distinct elements
4. Calculate the distinct count for each subarray and add its square to `total`
5. Return the final value of `total` after processing all subarrays

Time Complexity: O(n^2) where n is the length of the input array `nums`, since we are using two nested loops to generate all subarrays.
Space Complexity: O(n) for the set used to track distinct elements in the current subarray.

"""

class Solution:
    def sumCounts(self, nums: List[int]) -> int:
        total = 0

        for i in range(len(nums)):

            seen = set()

            for j in range(i, len(nums)):

                seen.add(nums[j])

                count = len(seen)
                total += count * count

        return total