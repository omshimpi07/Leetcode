"""
2652. Sum Multiples

Given a positive integer n, find the sum of all integers in the range [1, n] inclusive that are divisible by 3, 5, or 7.
Return an integer denoting the sum of all numbers in the given range satisfying the constraint.

Example 1: Input: n = 7 Output: 21
Explanation: Numbers in the range [1, 7] that are divisible by 3, 5, or 7 are 3, 5, 6, 7. The sum of these numbers is 21.

Difficulty : Easy

Approach:
1.Simple loop fron 0 to <=n if divides by 3 ,5,7,add i return sum tha's it.

Time Complexity : O(n)
Space Complexity : O(1)

"""

class Solution:
    def sumOfMultiples(self, n: int) -> int:
        total = 0

        for i in range(1, n + 1):
            if i % 3 == 0 or i % 5 == 0 or i % 7 == 0:
                total += i

        return total