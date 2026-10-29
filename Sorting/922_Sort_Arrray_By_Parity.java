/*
922. Sort Array By Parity II

Given an array of integers nums, half of the integers in nums are odd, and the other half are even.
Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.
Return any answer array that satisfies this condition.

Example 1: Input: nums = [4,2,5,7] Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.

Difficulty : easy

*/

class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        int left = 0; 
        int right = nums.length - 1;

        while(left < nums.length   && right >= 0){


            if(nums[left] % 2 == 0  ){
                left += 2;
            }
            else if(nums[right] % 2 != 0){
                right -= 2;
            }

            // if(nums[left] % 2 != 0 && nums[right] % 2 ==  0){
            else{
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left += 2;
                right -= 2;
            }
        }

        return nums;

    }
}