/*
1480. Running Sum of 1d Array
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).   
Return the running sum of nums.

Example 1: Input: nums = [1,2,3,4] Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
Example 2: Input: nums = [1,1,1,1,1] Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].

Difficulty : easy

Approach : Array.
1. Create a new array ans of the same length as the input array nums to store the running sums.
2. Initialize the first element of ans with the first element of nums.
3. Iterate through the input array nums starting from the second element (index 1) to the end of the array. 
4. For each index i, calculate the running sum by adding the current element nums[i] to the previous running sum ans[i-1] and store it in ans[i].
5. Return the new array ans after the loop completes.

Time Complexity: O(n) where n is the length of the input array nums, since we are iterating through the array once to fill the new array.
Space Complexity: O(n) for the new array ans of the same length as nums. However, we can optimize the space complexity to O(1) by modifying the input array nums in place to store the running sums instead of creating a new array.

*/
class Solution {

    public int[] runningSum(int[] nums) {

        // int n = nums.length;
        // int[] ans = new int[n];

        // for(int i = 0; i < n; i++){

        //     int sum = 0;

        //     for(int j = 0; j <= i; j++){
        //         sum += nums[j];
        //     }

        //     ans[i] = sum;
        // }

        // return ans;

        // int n = nums.length;

        // int[] ans = new int[n];

        // ans[0] = nums[0];

        // for(int i = 1; i < n; i++){

        //     ans[i] = ans[i-1] + nums[i];

        // }

        // return ans;

        for(int i = 1; i < nums.length; i++){

            nums[i] += nums[i-1];

        }
        return nums;
    }
}