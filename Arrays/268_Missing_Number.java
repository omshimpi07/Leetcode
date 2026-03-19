/*
268. Missing Number
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

Example 1: Input: nums = [3,0,1] Output: 2
Example 2: Input: nums = [0,1] Output: 2
Example 3: Input: nums = [9,6,4,2,3,5,7,0,1] Output: 8

Constraints:
n == nums.length
1 <= n <= 10^4
0 <= nums[i] <= n
All the numbers of nums are unique.

Difficulty: Easy

Approach:
1. Calculate the sum of the numbers in the input array.
2. Calculate the expected sum of the first n natural numbers using the formula n*(n+1)/2.
3. The missing number will be the difference between the expected sum and the actual sum.
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        int sum = 0;
        for(int num : nums){
            sum += num;
        }

        int expected = n * (n + 1) / 2;

        return expected - sum;
    }
}