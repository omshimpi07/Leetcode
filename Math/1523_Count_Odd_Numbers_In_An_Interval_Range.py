"""
1523. Count Odd Numbers in an Interval Range

Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).

Example 1: Input: low = 3, high = 7 Output: 3
Explanation: The odd numbers between 3 and 7 are [3,5,7].

Approach:
1. The number of odd numbers from 1 to n is given by (n +
    1) // 2. This formula works because for every pair of consecutive integers, one is odd and one is even.
2. To find the count of odd numbers between low and high, we can calculate the number of odd numbers from 1 to high and subtract the number of odd numbers from 1 to low - 1.
3. The final formula becomes: (high + 1) // 2 - low // 2.
4. This approach has a time complexity of O(1) and a space complexity of O(1).
5. The implementation of this approach is straightforward and can be done in a single line of code.
6. The code below implements this approach in Python.

"""

class Solution:
    def countOdds(self, low, high):
        return (high + 1) // 2 - low // 2