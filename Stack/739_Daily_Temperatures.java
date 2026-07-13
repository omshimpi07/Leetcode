/*
739. Daily Temperatures
Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.

Example 1: Input: temperatures = [73,74,75,71,69,72,76,73] Output: [1,1,4,2,1,1,0,0]
Example 2: Input: temperatures = [30,40,50,60] Output:[1,1,1,0]

Difficulty : medium

Approach : Stack.
1. Create a stack to keep track of the indices of the temperatures.
2. Iterate through the temperatures array:
   a. While the stack is not empty and the current temperature is greater than the temperature at the index stored at the top of the stack, pop the index from the stack and calculate the difference between the current index and the popped index. Store this difference in the answer array at the popped index.
   b. Push the current index onto the stack.    
3. After processing all temperatures, the answer array will contain the number of days to wait for a warmer temperature for each day. If no warmer temperature is found, the value will remain 0.

Time Complexity: O(n) where n is the number of temperatures, since each index is pushed and popped from the stack at most once.
Space Complexity: O(n) for the stack and the answer array.

*/

class Solution {

    public int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;

        int[] ans = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() &&
                   temperatures[i] > temperatures[stack.peek()]) {

                int idx = stack.pop();

                ans[idx] = i - idx;
            }
            stack.push(i);
        }
        return ans;
    }
}