/*
3300. Minimum Element After Replacement With Digit Sum

You are given an integer array nums.
You replace each element in nums with the sum of its digits.
Return the minimum element in nums after all replacements.

Example 1: Input: nums = [10,12,13,14] Output: 1 Explanation:
nums becomes [1, 3, 4, 5] after all replacements, with minimum element 1.

Example 2: Input: nums = [1,2,3,4] Output: 1
Explanation: nums becomes [1, 2, 3, 4] after all replacements, with minimum element 1.

Diificulty : easy

Approach : Math.
1. Initialize a variable minimum to store the minimum digit sum found so far, starting with infinity
2. Iterate through each number in the nums array:
   a. For each number, calculate the sum of its digits by repeatedly extracting the last digit (using modulo 10) and adding it to a digit_sum variable, then removing the last digit (using integer division by 10) until the number becomes 0.
   b. Update the minimum variable with the smaller value between the current minimum and the calculated digit_sum.
3. After processing all numbers, return the minimum variable as the result.

Time complexity of this approach is O(n * m), where n is the number of elements in nums and m is the average number of digits in the numbers. The space complexity is O(1) since we are using a constant amount of extra space.
Space Complexity: O(1) since we are using a constant amount of extra space.

*/
        

class Solution:
    def minElement(self, nums: List[int]) -> int:
        
        minimum = float("inf")

        for num in nums:
            digit_sum = 0

            while num > 0:
                digit_sum += num % 10
                num //= 10

            minimum = min(minimum, digit_sum)

        return minimum