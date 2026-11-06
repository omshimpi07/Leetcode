"""
2248. Intersection of Multiple Arrays

Given a 2D integer array nums where nums[i] is a non-empty array of distinct positive integers, return the list of integers that are present in each array of nums sorted in ascending order.
 
Example 1: Input: nums = [[3,1,2,4,5],[1,2,3,4],[3,4,5,6]] Output: [3,4]
Explanation:The only integers present in each of nums[0] = [3,1,2,4,5], nums[1] = [1,2,3,4], and nums[2] = [3,4,5,6] are 3 and 4, so we return [3,4].

Difficulty : Easy

"""

class Solution:
    def intersection(self, nums: list[list[int]]) -> list[int]:
        
        # freq = [0] * 1001

        # for i in range(len(nums)):
        #     for j in range(len(nums[i])):
        #         freq[nums[i][j]] += 1

        # result = []

        # for i in range(1, 1001):
        #     if freq[i] == len(nums):
        #         result.append(i)

        # return result

        # freq_map = {}

        # # Count frequency of every number
        # for i in range(len(nums)):
        #     for j in range(len(nums[i])):

        #         value = nums[i][j]

        #         freq_map[value] = freq_map.get(value, 0) + 1

        # result = []

        # # Find numbers present in every array
        # for key in freq_map:
        #     if freq_map[key] == len(nums):
        #         result.append(key)

        # result.sort()

        # return result

        common = set()

        # Store all elements of the first array
        for x in nums[0]:
            common.add(x)

        # Keep only elements present in subsequent arrays
        for i in range(1, len(nums)):

            current = set()

            for j in range(len(nums[i])):
                current.add(nums[i][j])

            common.intersection_update(current)

        result = list(common)

        result.sort()

        return result

        
        