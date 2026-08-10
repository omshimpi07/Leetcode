"""
1470.Shuffle The Array
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].

Example 1:

Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
Example 2:

Input: nums = [1,2,3,4,4,3,2,1], n = 4
Output: [1,4,2,3,3,2,4,1]

Difficulty : Easy

"""

class Solution:
    def shuffle(self, nums: list[int], n: int) -> list[int]:

        ans = [0] * len(nums)

        index = 0

        for i in range(n):
            ans[index] = nums[i]
            index += 1

            ans[index] = nums[i + n]
            index += 1

        return ans



        # ans = []

        # for x, y in zip(nums[:n], nums[n:]):
        #     ans.extend([x, y])

        # return ans