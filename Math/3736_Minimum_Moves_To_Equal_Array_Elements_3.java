/* 
3736. Minimum Moves to Equal Array Elements III

You are given an integer array nums.
In one move, you may increase the value of any single element nums[i] by 1.
Return the minimum total number of moves required so that all elements in nums become equal.

Example 1: Input: nums = [2,1,3] Output: 3

Explanation: To make all elements equal:
Increase nums[0] = 2 by 1 to make it 3.
Increase nums[1] = 1 by 1 to make it 2.
Increase nums[1] = 2 by 1 to make it 3.
Now, all elements of nums are equal to 3. The minimum total moves is 3.

Difficulty : Easy
*/

class Solution {
    public int minMoves(int[] nums) {
        
        // int max = Integer.MIN_VALUE;
        // int result = 0;

        // for(int i = 0; i< nums.length ; i++){

        //     max = Math.max(nums[i] , max);

        // }

        // for(int i = 0; i< nums.length ; i++){

        //     if(nums[i] == max){
        //         continue;
        //     }
        //     else{
        //         result += max - nums[i];
        //     }
        // }

        // return result;

        int max = Integer.MIN_VALUE;
        int result = 0;
        int sum = 0;
        
        for(int i = 0; i< nums.length ; i++){

            max = Math.max(nums[i] , max);
            sum += nums[i];
        }

        return max * nums.length - sum;

    }
}