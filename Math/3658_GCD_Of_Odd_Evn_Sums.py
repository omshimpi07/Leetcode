"""/*
3658. GCD of Odd and Even Sums

You are given an integer n. Your task is to compute the GCD (greatest common divisor) of two values:
sumOdd: the sum of the smallest n positive odd numbers.
sumEven: the sum of the smallest n positive even numbers.
Return the GCD of sumOdd and sumEven.

Example 1: Input: n = 4 Output: 4
Explanation:
Sum of the first 4 odd numbers sumOdd = 1 + 3 + 5 + 7 = 16
Sum of the first 4 even numbers sumEven = 2 + 4 + 6 + 8 = 20
Hence, GCD(sumOdd, sumEven) = GCD(16, 20) = 4.

Approach : Math
1. The sum of the first n odd numbers is given by the formula: sumOdd = n^2.
2. The sum of the first n even numbers is given by the formula: sumEven = n * (n + 1).
3. Use the Euclidean algorithm to compute the GCD of sumOdd and sumEven.
Time complexity : O(log(min(sumOdd, sumEven))) for the GCD computation.
Space complexity : O(1) as we are using a constant amount of space.

*/"""

class Solution:
    def gcd(self, a: int, b: int) -> int:

        while b != 0:
            temp = b
            b = a % b
            a = temp

        return a

    def gcdOfOddEvenSums(self, n: int) -> int:

        sum_odd = n * n
        sum_even = n * (n + 1)

        return self.gcd(sum_odd, sum_even)