    """
1748. Sum Of Unique Elements
You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.

Return the sum of all the unique elements of nums.

Example 1: Input: nums = [1,2,3,2] Output: 4
Explanation: The unique elements are [1,3], and the sum is 4.

Difficulty : easy

Approach : Dictionary.

1. Initialize an empty dictionary freq to store the frequency of each number in nums.
2. Iterate through each number num in nums:
    a. If num is not in freq, add it with a value of 1.
    b. If num is already in freq, increment its value by 1.
3. Initialize a variable total to 0 to store the sum of unique elements.    
4. Iterate through each number num in freq:
    a. If the frequency of num is 1, add num to total.

    """
class Solution:
    def sumOfUnique(self, nums: List[int]) -> int:
        
        freq = {}

        for num in nums:

            freq[num] = freq.get(num, 0) + 1

        total = 0

        for num in freq:

            if freq[num] == 1:
                total += num

        return total