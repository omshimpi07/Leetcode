"""
1281. Subtract the Product and Sum of Digits of an Integer
Given an integer number n, return the difference between the product of its digits and the sum of
    its digits.

Example 1:
Input: n = 234 Output: 15
Explanation: Product of digits = 2 * 3 * 4 = 24 Sum of digits = 2 + 3 + 4 = 9 Result = 24 - 9 = 15

Difficulty : easy

Approach    
1. Initialize two variables, product and total, to 1 and 0 respectively.
2. While n is greater than 0, do the following:
    a. Get the last digit of n using n % 10.
    b. Multiply product by the last digit.
    c. Add the last digit to total.
    d. Remove the last digit from n by performing integer division by 10.
3. Return the difference between product and total.

Time Complexity: O(d) where d is the number of digits in n.
Space Complexity: O(1) since we are using a constant amount of extra space.
    
"""

class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        product = 1
        total = 0

        while n > 0:
            digit = n % 10

            product *= digit
            total += digit
            n //= 10

        return product - total