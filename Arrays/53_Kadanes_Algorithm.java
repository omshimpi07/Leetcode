/*Kadane's Algorithm to find the maximum subarray sum in an array
Problem: 53. Maximum Subarray

Link: https://leetcode.com/problems/maximum-subarray/
Difficulty: Easy

Approach:
- Iterate through the array and keep track of the current sum and maximum sum.
Time Complexity: O(n)
Space Complexity: O(1)
*/



class Solution{

    public int maxSubArray(int[] a) {

        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        
        for(int i = 0;i<a.length;i++){

            currsum = Math.max(a[i],currsum + a[i]);
        
            maxsum = Math.max(currsum,maxsum);
        }
        return maxsum;
    }
           
};
