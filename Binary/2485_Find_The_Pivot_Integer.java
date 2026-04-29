/*
2485. Find the Pivot Integer
Given a positive integer n, find the pivot integer x such that:
The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.
Return the pivot integer x. If no such integer exists, return -1. It is guaranteed that there will be at most one pivot index for the given input.

Example 1: Input: n = 8 Output: 6 Explanation: The sum of the numbers from 1 to 6 is equal to the sum of the numbers from 6 to 8.
Example 2: Input: n = 1 Output: 1 Explanation: The sum of the numbers from 1 to 1 is equal to the sum of the numbers from 1 to 1.
Example 3: Input: n = 4 Output: -1 Explanation: There is no pivot integer for n = 4.        

Difficulty : easy   

Approach:
1. Iterate through all integers from 1 to n and calculate the sum of integers from  1 to x and from x to n for each integer x.
2. If the two sums are equal, return x as the pivot integer.                
Time Complexity: O(n^2) due to the nested loops for calculating the sums.
Space Complexity: O(1) as we are using only a constant amount of extra space for the variables.

*/

class Solution {
    public int pivotInteger(int n) {
        
        for(int x = 1; x <= n; x++){
            
            int left = 0;
            int right = 0;
            
            // sum from 1 to x
            for(int i = 1; i <= x; i++){
                left += i;
            }
            
            // sum from x to n
            for(int i = x; i <= n; i++){
                right += i;
            }
            
            if(left == right){
                return x;
            }
        }
        
        return -1;
    }
}