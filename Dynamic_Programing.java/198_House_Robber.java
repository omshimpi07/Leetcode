/*
198. House Robber
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.

Example 1: Input: nums = [1,2,3,1] Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.

Example 2: Input: nums = [2,7,9,3,1] Output: 12
Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
Total amount you can rob = 2 + 9 + 1 = 12.

Constraints:
1 <= nums.length <= 100
0 <= nums[i] <= 400

Difficulty : medium

Approach : Dynamic Programming.
1. Use a dynamic programming array dp where dp[i] represents the maximum amount of money that can be robbed from the first i houses.
2. Initialize dp[0] = nums[0] and dp[1] = max(nums[0], nums[1]).
3. Iterate through the nums array starting from the third house, updating dp[i] as the maximum of either robbing the current house and adding it to dp[i-2] or skipping the current house and taking dp[i-1].
4. Finally, return dp[n-1] where n is the length of the nums array, which will contain the maximum amount of money that can be robbed.

Time Complexity: O(n) where n is the number of houses, since we are iterating through the nums array once.
Space Complexity: O(n) for the dp array storing the maximum amounts for each house.

*/

class Solution {

    public int rob(int[] nums) {

        int n = nums.length;

        if (n == 1)
            return nums[0];

        int[] dp = new int[n];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {

            dp[i] = Math.max(dp[i - 1], nums[i] + dp[i - 2]);
        }

        return dp[n - 1];
    }
}