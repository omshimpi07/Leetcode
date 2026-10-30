"""
2574. Left and Right Sum Differences

You are given a 0-indexed integer array nums of size n.
Define two arrays leftSum and rightSum where:
leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
Return an integer array answer of size n where answer[i] = |leftSum[i] - rightSum[i]|.

Example 1: Input: nums = [10,4,8,3] Output: [15,1,11,22]
Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].

Difficulty : Easy

"""

class Solution:
    def leftRightDifference(self, nums: List[int]) -> List[int]:
        # left = [0] * len(nums)
        # right = [0] * len(nums)

        # left[0] = 0
        # total = 0

        # for i in range(1, len(nums)):
        #     total += nums[i - 1]
        #     left[i] = total

        # right[-1] = 0
        # total = 0

        # for i in range(len(nums) - 2, -1, -1):
        #     total += nums[i + 1]
        #     right[i] = total

        # output = [0] * len(nums)

        # for i in range(len(nums)):
        #     output[i] = abs(left[i] - right[i])

        # return output

         # STEP 1: Calculate total sum
        total_sum = 0

        for x in nums:
            total_sum += x

        # STEP 2: Calculate each index's difference
        left_sum = 0
        output = [0] * len(nums)

        for i in range(len(nums)):

            # Calculate right sum using total sum
            right_sum = total_sum - left_sum - nums[i]

            # Calculate absolute difference
            output[i] = abs(left_sum - right_sum)

            # Include current element for the next index
            left_sum += nums[i]

        return output