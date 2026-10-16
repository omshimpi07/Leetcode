"""
2520. Count the Digits that Divide a Number

Given an integer num, return the number of digits in num that divide num.
An integer val divides nums if nums % val == 0.

Example 1: Input: num = 7 Output: 1
Explanation: 7 divides itself, hence the answer is 1.

Difficulty: Easy

"""

class Solution:
    def countDigits(self, num: int) -> int:
        count = 0

        temp2 = num

        while temp2 > 0:

            digit = temp2 % 10

            if num % digit == 0:
                count += 1

            temp2 //= 10

        return count