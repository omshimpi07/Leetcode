/*
414. Third Maximum Number
Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

Example 1: Input: nums = [3,2,1] Output: 1 Explanation: The third distinct maximum is 1.
Example 2: Input: nums = [1,2] Output: 2 Explanation: The third distinct maximum does not exist, so the maximum (2) is returned instead.
Example 3: Input: nums = [2,2,3,1] Output:
1 Explanation: The third distinct maximum is 1.

Difficulty: Easy

Approach:
1. Initialize three variables to store the first, second, and third maximum values, and set
them to Long.MIN_VALUE to handle edge cases where the input array may contain Integer.MIN_VALUE.
2. Iterate through the input array and update the first, second, and third maximum values accordingly, while ensuring that they are distinct.
3. After the loop, check if the third maximum value is still Long.MIN_VALUE, which indicates that there are not enough distinct values in the array. If so, return the first maximum value; otherwise, return the third maximum value.

Time Complexity: O(n) where n is the length of the input array.
Space Complexity: O(1) since we are using only a constant amount of extra space to store the three maximum values.
*/

class Solution {
    public int thirdMax(int[] nums) {

        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int num : nums) {

            if (num == first || num == second || num == third) continue;

            if (num > first) {
                third = second;
                second = first;
                first = num;

            } else if (num > second) {
                third = second;
                second = num;

            } else if (num > third) {
                third = num;
            }
        }
        return (third == Long.MIN_VALUE) ? (int) first : (int) third;
    }
}