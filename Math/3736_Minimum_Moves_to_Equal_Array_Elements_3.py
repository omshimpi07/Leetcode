"""
3736. Minimum Moves to Equal Array Elements III

You are given an integer array nums.
In one move, you may increase the value of any single element nums[i] by 1.
Return the minimum total number of moves required so that all elements in nums become equal.

Example 1: Input: nums = [2,1,3] Output: 3

Explanation: To make all elements equal:
Increase nums[0] = 2 by 1 to make it 3.
Increase nums[1] = 1 by 1 to make it 2.
Increase nums[1] = 2 by 1 to make it 3.
Now, all elements of nums are equal to 3. The minimum total moves is 3.

Difficulty : Easy

"""

class Solution:
    def minMoves(self, nums: List[int]) -> int:
        # maximum = float("-inf")
        # result = 0

        # for i in range(len(nums)):
        #     maximum = max(nums[i], maximum)

        # for i in range(len(nums)):

        #     if nums[i] == maximum:
        #         continue

        #     else:
        #         result += maximum - nums[i]

        # return result

        maximum = float("-inf")
        result = 0
        total = 0

        for i in range(len(nums)):

            maximum = max(nums[i], maximum)
            total += nums[i]

        return maximum * len(nums) - total