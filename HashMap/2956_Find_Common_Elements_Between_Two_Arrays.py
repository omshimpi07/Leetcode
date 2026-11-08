"""2956. Find Common Elements Between Two Arrays
Solved
Easy
Topics
premium lock icon
Companies
Hint
You are given two integer arrays nums1 and nums2 of sizes n and m, respectively. Calculate the following values:

answer1 : the number of indices i such that nums1[i] exists in nums2.
answer2 : the number of indices i such that nums2[i] exists in nums1.
Return [answer1,answer2].

 

Example 1:

Input: nums1 = [2,3,2], nums2 = [1,2]

Output: [2,1]

Explanation:

"""

class Solution:
    def findIntersectionValues(self, nums1: List[int], nums2: List[int]) -> List[int]:
        present1 = [False] * 101
        present2 = [False] * 101

        for num in nums1:
            present1[num] = True

        for num in nums2:
            present2[num] = True

        answer1 = 0
        answer2 = 0

        for num in nums1:
            if present2[num]:
                answer1 += 1

        for num in nums2:
            if present1[num]:
                answer2 += 1

        return [answer1, answer2]