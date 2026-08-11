"""
1365. How Many Numbers Are Smaller Than the Current Number
Given the array nums, for each nums[i] find out how many numbers in the array are
smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

Example 1: Input: nums = [8,1,2,2,3] output: [4,0,1,1,3]
Explanation: For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).

Difficulty : Easy

Approach:
1. Create a frequency dictionary to count occurrences of each number in the input list. 
2. Initialize an output list of the same length as the input list, filled with zeros.
3. Iterate through each number in the input list. For each number, calculate how many numbers are smaller than it by summing the counts of all numbers less than the current number using the frequency dictionary.
4. Store the count in the corresponding index of the output list.

Time complexity : O(n + m), where n is the length of the input list and m is the range of numbers in the input list (the maximum number minus the minimum number). The first loop runs in O(n) to build the frequency dictionary, and the second loop runs in O(n * m) in the worst case, but since we are only summing counts for numbers less than the current number, it can be considered efficient for a limited range of numbers.
Space complexity : O(n + m), where n is the length of the input list and m is the range of numbers in the input list. The frequency dictionary takes O(m) space, and the output list takes O(n) space.
    
"""
    
class Solution:
    def smallerNumbersThanCurrent(self, nums: list[int]) -> list[int]:

        freq = {}

        for num in nums:
            freq[num] = freq.get(num, 0) + 1

        output = [0] * len(nums)

        for i in range(len(nums)):

            count = 0

            for j in range(nums[i]):
                count += freq.get(j, 0)

            output[i] = count

        return output