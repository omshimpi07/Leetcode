"""

3718. Smallest Missing Multiple Of K
Given an integer array nums and an integer k, return the smallest positive integer that is a multiple of k and does not appear in nums.
A positive integer x is a multiple of k if there exists an integer n such that x = n * k.

Example 1:Input: nums = [1,2,3,4], k = 2 Output: 6

Difficulty : easy

Approach : 1. Create a set of numbers from the input list nums.
2. Initialize a variable multiple with the value of k.
3. Use a while loop to check if the current multiple is present in the set of numbers
4. If the current multiple is present, increment the multiple by k and repeat step 3.
5. If the current multiple is not present in the set, return the current multiple as the
6. smallest positive integer that is a multiple of k and does not appear in nums.   

Time Complexity : O(n) where n is the length of the input list nums. In the worst case, we may need to check all multiples of k up to the maximum value in nums.
Space Complexity : O(n) where n is the length of the input list nums. We are using a set to store the numbers from the input list, which requires additional space.

"""

class Solution:
    def missingMultiple(self, nums: List[int], k: int) -> int:
        numbers = set(nums)

        multiple = k

        while multiple in numbers:
            multiple += k

        return multiple