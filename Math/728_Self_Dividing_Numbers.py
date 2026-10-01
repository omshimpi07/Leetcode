"""
728. Self Dividing Numbers

A self-dividing number is a number that is divisible by every digit it contains.
For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
A self-dividing number is not allowed to contain the digit zero.
Given two integers left and right, return a list of all the self-dividing numbers in the range [left, right] (both inclusive).

Example 1: Input: left = 1, right = 22 Output: [1,2,3,4,5,6,7,8,9,11,12,15,22]
Example 2: Input: left = 47, right = 85 Output: [48,55,66,77]
 
Diificulty : easy

Approach : Brute Force
1. Iterate through all the numbers from left to right.
2. For each number, check if it is a self-dividing number by checking if it
is divisible by each of its digits. 
3. If it is a self-dividing number, add it to the result list.

Time Complexity: O(n * d) where n is the number of integers in the range [left, right] and d is the number of digits in the number. In the worst case, d can be log10(right).
Space Complexity: O(n) where n is the number of self-dividing numbers in the range [left, right].

"""
class Solution:
    def selfDividingNumbers(self, left: int, right: int) -> list[int]:
        #Brute Force But First Instituion by me
        # result = []

        # count = 0
        # number = left
        # temp = number
        # temp2 = temp

        # while number <= right:

        #     length = 0

        #     while temp2 > 0:
        #         length += 1
        #         temp2 //= 10

        #     while temp > 0:

        #         last_digit = temp % 10

        #         if last_digit == 0:
        #             break

        #         if number % last_digit == 0:
        #             count += 1

        #         temp //= 10

        #     if length == count:
        #         result.append(number)

        #     count = 0
        #     number += 1
        #     temp = number
        #     temp2 = temp

        # return result

        # Optimized 1 pass derived from 1st brute approach
        result = []

        for number in range(left, right + 1):

            temp = number
            valid = True

            while temp > 0:

                digit = temp % 10

                if digit == 0 or number % digit != 0:
                    valid = False
                    break

                temp //= 10

            if valid:
                result.append(number)

        return result