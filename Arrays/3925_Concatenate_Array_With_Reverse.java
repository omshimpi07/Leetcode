/*
3925. Concatenate Array With Reverse

You are given an integer array nums of length n.
Construct a new array ans of length 2 * n such that the first n elements are the same as nums, and the next n elements are the elements of nums in reverse order.
Formally, for 0 <= i <= n - 1:

ans[i] = nums[i]
ans[i + n] = nums[n - i - 1]
Return an integer array ans.

Example 1: Input: nums = [1,2,3] Output: [1,2,3,3,2,1]
Explanation:
The first n elements of ans are the same as nums.
For the next n = 3 elements, each element is taken from nums in reverse order:
ans[3] = nums[2] = 3
ans[4] = nums[1] = 2
ans[5] = nums[0] = 1
Thus, ans = [1, 2, 3, 3, 2, 1].

Difficulty : Easy

Appraoch :
1.create array of len * 2
2. AN normal loop till len fill nums[i] in nums2.
3. then intialized j at end of array nums and then loop to end of array nums till nums.length *2 and assign nums2[i] = nums[j].

Appraoch 2 :
1. Inplcae normally palce till array legth and then using formula from last to md fill elements in nums2.

Time Complexity O(n)
Space Complexity O(n)

*/

class Solution {
    public int[] concatWithReverse(int[] nums) {
        

        // int nums2[] = new int[nums.length*2];

        // for(int i = 0; i< nums.length ; i++){

        //     nums2[i] = nums[i];
        // }
        // int j = nums.length-1;
        // for(int i = nums.length; i < nums.length * 2; i++){

        //     nums2[i] = nums[j];
        //     j--;
        // }
        // return nums2;

        int n = nums.length;
        int[] result = new int[2 * n];

        for (int i = 0; i < n; i++) {
            result[i] = nums[i];
            result[2 * n - 1 - i] = nums[i];
        }

        return result;




    }
}