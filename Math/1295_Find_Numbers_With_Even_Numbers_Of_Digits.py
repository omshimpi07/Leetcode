"""
1295. Find Numbers with Even Number of Digits

Given an array nums of integers, return how many of them contain an even number of digits.

Example 1: Input: nums = [12,345,2,6,7896]Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.

Diificulty : easy

Approach :
1. Initialize a variable even to 0 to keep track of the count of numbers with even digits.
2. Iterate through each number in the input list nums.
3. For each number, initialize a variable count to 0 to count the number of digits.
4. Use a while loop to divide the number by 10 until it becomes 0,
    incrementing the count variable for each division to determine the number of digits.
5. After counting the digits, check if the count is even (count % 2 == 0).
6. If the count is even, increment the even variable by 1.
7. After iterating through all the numbers, return the value of even, which represents the count of numbers with an even number of digits.

The time complexity of this approach is O(n * d), where n is the number of elements in the input list nums and d is the average number of digits in the numbers. The space complexity is O(1) since we are using a constant amount of extra space.
Space complexity is O(1) since we are using a constant amount of extra space.

"""

class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        # count = 0
        # even = 0

        # for i in range(len(nums)):
        #     while nums[i] > 0:
        #         count += 1
        #         nums[i] //= 10

        #     if count % 2 == 0:
        #         even += 1

        #     count = 0

        # return even

        even = 0

        for num in nums:
            count = 0

            while num > 0:
                count += 1
                num //= 10

            if count % 2 == 0:
                even += 1

        return even

