"""
2057. Smallest Index With Equal Value
Given a 0-indexed integer array nums, return the smallest index i of nums such that i mod 10 == nums[i], or -1 if such index does not exist.
x mod y denotes the remainder when x is divided by y.

Example 1: Input: nums = [0,1,2] Output: 0
Explanation: 
i=0: 0 mod 10 = 0 == nums[0].
i=1: 1 mod 10 = 1 == nums[1].
i=2: 2 mod 10 = 2 == nums[2].
All indices have i mod 10 == nums[i], so we return the smallest index 0.

Diificulty: Easy

Approach:
1. Iterate through the array and check if the index modulo 10 is equal to the value at that index.
2. If a match is found, return the index.
3. If no match is found after checking all indices, return -1.

Time complexity of this approach is O(n), where n is the length of the input array nums, since we are iterating through the array once. The space complexity is O(1) as we are using a constant amount of extra space.
Space complexity is O(1) since we are not using any additional data structures that grow with the input size.

"""

class Solution:
    def smallestEqual(self, nums: list[int]) -> int:
        for i in range(len(nums)):

            if i % 10 == nums[i]:
                return i

        return -1