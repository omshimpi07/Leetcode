"""
977. Squares of a Sorted Array
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

Example 1:
Input: nums = [-4,-1,0,3,10]    
Output: [0,1,9,16,100]

Difficulty: Easy

Approach:
1. Initialize an empty list ans of the same length as nums to store the squared values.
2. Use two pointers, left and right, starting at the beginning and end of the nums array respectively.
3. Iterate while left is less than or equal to right:
    a. Compare the absolute values of nums[left] and nums[right].
    b. Square the larger absolute value and place it at the current index in ans.
    c. Move the corresponding pointer (left or right) inward and decrement the index.
4. Return the ans list after the loop ends.
Time Complexity: O(n), where n is the length of the input array nums.
Space Complexity: O(n), as we are using an additional list to store the squared values.
      
"""

class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        # nums = [x * x for x in nums]
        # nums.sort()
        # return nums

        # return sorted(x * x for x in nums)

        n = len(nums)

        ans = [0] * n

        left = 0
        right = n - 1
        index = n - 1

        while left <= right:

            if abs(nums[left]) > abs(nums[right]):
                ans[index] = nums[left] * nums[left]
                left += 1
            else:
                ans[index] = nums[right] * nums[right]
                right -= 1

            index -= 1

        return ans