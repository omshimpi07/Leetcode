/*
746. Min Cost Climbing Stairs
You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.
You can either start from the step with index 0, or the step with index 1.
Return the minimum cost to reach the top of the floor.

example 1: Input: cost = [10,15,20] Output: 15
Explanation: You will start at index 1.
example 2: Input: cost = [1,100,1,1,1,100,1,1,100,1] Output: 6

Difficulty : easy

Approach : Dynamic Programming.
1. Use two variables to keep track of the minimum cost to reach the last two steps.
2. Initialize the first two steps with their respective costs.
3. Iterate through the cost array starting from the third step, calculating the minimum cost to reach the current step as the cost of the current step plus the minimum of the costs to reach the last two steps.
4. Update the last two costs accordingly.
5. Finally, return the minimum of the costs to reach the last two steps, as you can reach the top from either of them.

Time Complexity: O(n) where n is the number of steps, since we are iterating through the cost array once.
Space Complexity: O(1) since we are using a constant amount of space for the last two costs.

*/

class Solution {

    public int minCostClimbingStairs(int[] cost) {

        int first = cost[0];
        int second = cost[1];

        for (int i = 2; i < cost.length; i++) {

            int current = cost[i] + Math.min(first, second);

            first = second;
            second = current;
        }

        return Math.min(first, second);
    }
}

// class Solution {

//     public int minCostClimbingStairs(int[] cost) {

//         int n = cost.length;

//         int[] dp = new int[n];

//         dp[0] = cost[0];
//         dp[1] = cost[1];

//         for (int i = 2; i < n; i++) {

//             dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
//         }

//         return Math.min(dp[n - 1], dp[n - 2]);
//     }
// }