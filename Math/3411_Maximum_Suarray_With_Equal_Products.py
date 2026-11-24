"""
3411. Maximum Subarray With Equal Products

You are given an array of positive integers nums.
An array arr is called product equivalent if prod(arr) == lcm(arr) * gcd(arr), where:
prod(arr) is the product of all elements of arr.
gcd(arr) is the GCD of all elements of arr.
lcm(arr) is the LCM of all elements of arr.
Return the length of the longest product equivalent subarray of nums.

Example 1: Input: nums = [1,2,1,2,1,1,1] Output: 5

Explanation: The longest product equivalent subarray is [1, 2, 1, 1, 1], where prod([1, 2, 1, 1, 1]) = 2, gcd([1, 2, 1, 1, 1]) = 1, and lcm([1, 2, 1, 1, 1]) = 2.

Difficulty : Easy
"""
    
    class Solution:
    def maxLength(self, nums: List[int]) -> int:
        max_length = 0

        for i in range(len(nums)):

            product = 1
            current_gcd = 0
            current_lcm = 1

            for j in range(i, len(nums)):

                product *= nums[j]

                current_gcd = self.gcd(current_gcd, nums[j])
                current_lcm = self.lcm(current_lcm, nums[j])

                comparison = current_gcd * current_lcm

                if product == comparison:
                    max_length = max(max_length, j - i + 1)

                if product > comparison:
                    break

        return max_length

    def gcd(self, a: int, b: int) -> int:

        while b != 0:
            remainder = a % b
            a = b
            b = remainder

        return a

    def lcm(self, a: int, b: int) -> int:

        return (a // self.gcd(a, b)) * b