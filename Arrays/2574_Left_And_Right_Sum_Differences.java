/*
2574. Left and Right Sum Differences

You are given a 0-indexed integer array nums of size n.
Define two arrays leftSum and rightSum where:
leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
Return an integer array answer of size n where answer[i] = |leftSum[i] - rightSum[i]|.

Example 1: Input: nums = [10,4,8,3] Output: [15,1,11,22]
Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].

*/

class Solution {
    public int[] leftRightDifference(int[] nums) {
        
        int left[] = new int[nums.length];
        int right[] = new int[nums.length];
        left[0] = 0;
        int sum = 0;
        int sum1 = 0;
        for(int i = 1 ; i<nums.length ; i++){

            sum += nums[i - 1];
            left[i] = sum;
        }

        right[nums.length - 1] = 0;
        for(int i = nums.length - 2 ; i>= 0 ; i--){

            sum1 += nums[i + 1];

            right[i] = sum1;
        }

        int output[] = new int[nums.length];
       
        for(int i = 0; i< nums.length ; i++){

            output[i] = Math.abs(left[i] - right[i]);
           
        }

        return output;



    }
}