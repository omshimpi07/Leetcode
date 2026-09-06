"""
1342. Number of Steps to Reduce a Number to Zero

Given an integer num, return the number of steps to reduce it to zero.
In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.

Example 1: Input: num = 14 Output: 6
Explanation: 
Step 1) 14 is even; divide by 2 and obtain 7. 
Step 2) 7 is odd; subtract 1 and obtain 6.
Step 3) 6 is even; divide by 2 and obtain 3. 
Step 4) 3 is odd; subtract 1 and obtain 2. 
Step 5) 2 is even; divide by 2 and obtain 1. 
Step 6) 1 is odd; subtract 1 and obtain 0.

Diificulty : easy

Approach : Iterative
1. Initialize a counter to keep track of the number of steps.
2. While the number is greater than zero, check if it is even or odd.
3. If it is even, divide it by 2 and increment the counter.
4. If it is odd, subtract 1 from it and increment the counter.
5. Return the counter as the result.

Time Complexity: O(log n), where n is the input number.
Space Complexity: O(1), as we are using a constant amount of space.

"""

class Solution:
    def numberOfSteps(self, num: int) -> int:
        count = 0

        while num > 0:
            if num % 2 == 0:
                num //= 2
                count += 1
            else:
                num -= 1
                count += 1

        return count