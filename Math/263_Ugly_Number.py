"""
263. Ugly Number
An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.

Example 1: Input: n = 6 Output: true Explanation: 6 = 2 × 3
Example 2: Input: n = 1 Output: true Explanation: 1 has no
prime factors, therefore all of its prime factors are limited to 2, 3, and 5.

Diificulty : easy

Approach : Keep dividing the number by 2, 3, and 5 until it's no longer divisible by any of them. If the result is 1, then the number is ugly.

"""

class Solution:
    def isUgly(self, n: int) -> bool:
        if n <= 0:
            return False

        while n % 2 == 0:
            n //= 2

        while n % 3 == 0:
            n //= 3

        while n % 5 == 0:
            n //= 5

        return n == 1