/*
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

Approach : Math.
1. The sum of the first n positive odd numbers can be calculated using the formula: sumOdd = n^2.
2. The sum of the first n positive even numbers can be calculated using the formula: sumEven = n * (n + 1).
3. To find the GCD of sumOdd and sumEven, we can use the Euclidean algorithm, which states that GCD(a, b) = GCD(b, a % b) until b becomes 0. The last non-zero value of a will be the GCD.
Time Complexity: O(log(min(sumOdd, sumEven))) for the GCD calculation.
Space Complexity: O(1) since we are using a constant amount of space for the calculations.

*/

class Solution {
    public int gcdOfOddEvenSums(int n) {
        //return n;
        int sumOdd = n * n;

int sumEven = n * (n + 1);

return gcd(sumOdd, sumEven);
    }
private int gcd(int a, int b) {

while (b != 0) {

int temp = b;

b = a % b;

a = temp;

}

return a;
    }
}