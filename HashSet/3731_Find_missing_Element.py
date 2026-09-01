"""
3731. Find Missing Elements

You are given an integer array nums consisting of unique integers.
Originally, nums contained every integer within a certain range. However, some integers might have gone missing from the array.
The smallest and largest integers of the original range are still present in nums.
Return a sorted list of all the missing integers in this range. If no integers are missing, return an empty list.

Example 1: Input: nums = [1,4,2,5] Output: [3]
Explanation: The smallest integer is 1 and the largest is 5, so the full range should be [1,2,3,4,5]. Among these, only 3 is missing.

Example 2: Input: nums = [7,8,6,9] Output: []
Explanation: The smallest integer is 6 and the largest is 9, so the full range is [6,7,8,9]. All integers are already present, so no integer is missing.

Constraints:

2 <= nums.length <= 100
1 <= nums[i] <= 100

Difficulty : easy

Approach :
1. Find the smallest and largest integers in the array.
2. Create a set of the given integers for O(1) lookups.
3. Iterate through the range from smallest to largest and check for missing integers.
4. Return the list of missing integers.

Time Complexity : O(n) where n is the number of integers in the range from smallest to largest.
Space Complexity : O(n) for storing the set of integers and the list of missing integers.

"""

from ast import List


class Solution:
    def findMissingElements(self, nums: List[int]) -> List[int]:
        smallest = min(nums)
        largest = max(nums)

        numbers = set(nums)

        missing = []

        for num in range(smallest, largest + 1):
            if num not in numbers:
                missing.append(num)

        return missing