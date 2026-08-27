/*
263. Ugly Number
An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.

Example 1: Input: n = 6 Output: true Explanation: 6 = 2 × 3
Example 2: Input: n = 1 Output: true Explanation: 1 has no
prime factors, therefore all of its prime factors are limited to 2, 3, and 5.

Diificulty : easy

Approach : Math.
1. If n is less than or equal to 0, return false since ugly numbers are positive integers.
2. While n is divisible by 2, divide n by 2.
3. While n is divisible by 3, divide n by 3.
4. While n is divisible by 5, divide n by 5.
5. After removing all factors of 2, 3, and 5, check if n is equal to 1. If it is, return true (n is an ugly number); otherwise, return false.

Time Complexity : O(log n) since we are dividing n by 2, 3, and 5 repeatedly.   
Space Complexity : O(1) since we are using a constant amount of space for the calculations.

*/

class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 2 == 0) {
            n = n / 2;
        }

        while (n % 3 == 0) {
            n = n / 3;
        }

        while (n % 5 == 0) {
            n = n / 5;
        }

        return n == 1;
    }
}