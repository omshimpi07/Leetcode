"""
594. Longest Harmonious Subsequence

We define a harmonious array as an array where the difference between its maximum value and its minimum value is exactly 1.
Given an integer array nums, return the length of its longest harmonious subsequence among all its possible subsequences.

Example 1: Input: nums = [1,3,2,2,5,2,3,7] Output: 5
Explanation: The longest harmonious subsequence is [3,2,2,2,3].

Example 2: Input: nums = [1,2,3,4] Output: 2
Explanation: The longest harmonious subsequences are [1,2], [2,3], and [3,4], all of which have a length of 2.

Difficulty : easy

Approach:
1. Create a frequency dictionary to count the occurrences of each number in the input list.
2. Iterate through the keys in the frequency dictionary and check if the key + 1 exists in the dictionary.
3. If it does, calculate the length of the harmonious subsequence by adding the frequency of
the current key and the frequency of the key + 1.
4. Keep track of the maximum length found during the iteration.
5. Return the maximum length as the result.

Time Complexity: O(n), where n is the length of the input list. We iterate through the list to build the frequency dictionary and then iterate through the keys in the dictionary.
Space Complexity: O(n), where n is the number of unique elements in the input list. We store the frequency of each unique element in a dictionary.

"""

class Solution:
    def findLHS(self, nums: list[int]) -> int:
        frequency = {} 
        # Count frequency 
        for num in nums: 
            frequency[num] = frequency.get(num, 0) + 1 
        
        ans = 0
            
         # Check x and x + 1 
        for x in frequency:
            if x + 1 in frequency: 
                length = frequency[x] + frequency[x + 1] 
                ans = max(ans, length) 
        return ans