"""
697.Degree of an Array
Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements.
Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.

Example 1: Input: nums = [1,2,2,3,1] Output: 2
Explanation: 
The input array has a degree of 2 because both elements 1 and 2 appear twice.
Of the subarrays that have the same degree:
[1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
The shortest length is 2. So return 2.

Difficulty : easy

Approach :
1. Create three dictionaries: freq to store the frequency of each element, first to store the first occurrence index of each element, and last to store the last occurrence index of each element.
2. Iterate through the input list nums and update the freq, first, and last dictionaries accordingly.
3. Calculate the degree of the array by finding the maximum value in the freq dictionary.
4. Initialize a variable ans to the length of the input list nums.
5. Iterate through the keys in the freq dictionary and check if the frequency of each element is equal to the degree.
6. If the frequency is equal to the degree, calculate the length of the subarray for that element using the first and last occurrence indices and update ans with the minimum length found.
7. Return the value of ans, which represents the smallest possible length of a subarray with the same degree as nums.

The time complexity of this approach is O(n), where n is the number of elements in the input list nums. The space complexity is O(n) as well, since we are using dictionaries to store the frequency and indices of the elements.
Space complexity is O(n) as well, since we are using dictionaries to store the frequency and indices of the elements.

"""

class Solution:
    def findShortestSubArray(self, nums: list[int]) -> int:
        freq = {}
        first = {}
        last = {}

        for i in range(len(nums)):
            x = nums[i]

            freq[x] = freq.get(x, 0) + 1

            if x not in first:
                first[x] = i

            last[x] = i

        degree = max(freq.values())
        ans = len(nums)

        for x in freq:
            if freq[x] == degree:
                ans = min(ans, last[x] - first[x] + 1)

        return ans

        # freq = [0] * 50000
        # first = [-1] * 50000
        # last = [-1] * 50000

        # for i in range(len(nums)):
        #     x = nums[i]

        #     freq[x] += 1

        #     if first[x] == -1:
        #         first[x] = i

        #     last[x] = i

        # degree = max(freq)

        # ans = len(nums)

        # for x in range(50000):
        #     if freq[x] == degree:
        #         ans = min(ans, last[x] - first[x] + 1)

        # return ans
        