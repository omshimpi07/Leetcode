"""

367. Valid Perfect Square

Given a positive integer num, return true if num is a perfect square or false otherwise.
A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.
You must not use any built-in library function, such as sqrt.

Example 1: Input: num = 16 Output: true
Explanation: We return true because 4 * 4 = 16 and 4 is an integer.

DIfificulty : easy

Algorithm: Binary Search
1. Initialize left and right pointers to 1 and num // 2 respectively.
2. While left is less than or equal to right, calculate the mid value as the average    
of left and right.
3. If mid * mid is equal to num, return True.
4. If mid * mid is less than num, move the left pointer to mid + 1.
5. If mid * mid is greater than num, move the right pointer to mid - 1.
6. If the loop ends without finding a perfect square, return False.

Time Complexity: O(log n) - The binary search algorithm reduces the search space by half in each iteration, resulting in a logarithmic time complexity.
Space Complexity: O(1) - The algorithm uses a constant amount of space for the left, right, and mid pointers, regardless of the input size.

"""

class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        if num == 1:
            return True 
        left = 1 
        right = num // 2 
        while left <= right: 
            mid = left + (right - left) // 2 
            if mid * mid == num: 
                return True 
            elif mid * mid < num: 
                left = mid + 1 
            else: right = mid - 1 
        return False