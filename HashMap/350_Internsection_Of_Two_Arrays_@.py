"""
350. Intersection of Two Arrays II

Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

Example 1: Input: nums1 = [1,2,2,1], nums2 = [2,2] Output: [2,2]

Example 2: Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4] Output: [4,9]
Explanation: [9,4] is also accepted.
 
Difficulty : Easy

"""

class Solution:
    def intersect(self, nums1: list[int], nums2: list[int]) -> list[int]:
        # result = []

        # for i in range(len(nums1)):

        #     for j in range(len(nums2)):

        #         if nums1[i] == nums2[j]:

        #             result.append(nums1[i])

        #             nums2[j] = -1
        #             break

        # return result

        result = []

        freq_map = {}

        # Step 1: Count occurrences in nums2
        for num in nums2:
            freq_map[num] = freq_map.get(num, 0) + 1

        # Step 2: Find common occurrences
        for num in nums1:

            if freq_map.get(num, 0) > 0:

                result.append(num)

                freq_map[num] = freq_map[num] - 1

        return result