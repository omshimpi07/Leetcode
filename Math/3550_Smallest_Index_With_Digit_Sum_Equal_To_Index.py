"""
3550. Smallest Index With Digit Sum Equal to Index

You are given an integer array nums.
Return the smallest index i such that the sum of the digits of nums[i] is equal to i.
If no such index exists, return -1.

Example 1: Input: nums = [1,3,2] Output: 2
Explanation:
For nums[2] = 2, the sum of digits is 2, which is equal to index i = 2. Thus, the output is 2.

Example 2: Input: nums = [1,10,11] Output: 1
Explanation:
For nums[1] = 10, the sum of digits is 1 + 0 = 1, which is equal to index i = 1.
For nums[2] = 11, the sum of digits is 1 + 1 = 2, which is equal to index i = 2.
Since index 1 is the smallest, the output is 1.

Difficulty : easy

Appraoch : Iteration.
1. Iterate through the nums array using an index i.
2. For each nums[i], calculate the sum of its digits.
3. If the sum of digits is equal to the index i, return i.
4. If no such index is found after checking all elements, return -1.

The time complexity of this approach is O(n * d), where n is the length of the nums array and d is the number of digits in the largest number in nums. The space complexity is O(1) since we are using a constant amount of extra space.
Space Complexity : O(1)

"""

class Solution:
    def smallestIndex(self, nums: List[int]) -> int:
        for i in range(len(nums)):
            
            current = nums[i]
            sumdigit = 0
            
            while current > 0:
                
                sumdigit += current % 10
                current //= 10
            
            if sumdigit == i:
                return i

        return -1
