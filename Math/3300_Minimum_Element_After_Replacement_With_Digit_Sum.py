"""3300. Minimum Element After Replacement With Digit Sum

You are given an integer array nums.
You replace each element in nums with the sum of its digits.
Return the minimum element in nums after all replacements.

Example 1: Input: nums = [10,12,13,14] Output: 1 Explanation:
nums becomes [1, 3, 4, 5] after all replacements, with minimum element 1.

Example 2: Input: nums = [1,2,3,4] Output: 1
Explanation: nums becomes [1, 2, 3, 4] after all replacements, with minimum element 1.

Diificulty : easy

Approach:
1. Initialize a variable min to Integer.MAX_VALUE to keep track of the minimum digit sum.
2. Iterate through each number in the nums array.
3. For each number, calculate the sum of its digits by repeatedly taking the modulus of 10 and dividing by 10 until the number becomes 0.
4. Update the min variable with the minimum of the current min and the calculated digit sum.
5. Return the min variable as the minimum element after all replacements.

Time Complexity: O(n * d) where n is the number of elements in nums and d is the number of digits in the largest number.
Space Complexity: O(1) since we are using a constant amount of extra space.

"""


class Solution {
    public int minElement(int[] nums) {
        
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++) {

            int num = nums[i];
            int sum = 0;

            while(num > 0) {
                sum += num % 10;
                num /= 10;
            }

            min = Math.min(min, sum);
        }

        return min;
    }
}