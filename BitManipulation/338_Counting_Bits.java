/* 
338. Counting Bits
Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.

Example 1:
Input: n = 2
Output: [0,1,1]
Explanation:
0 --> 0
1 --> 1
2 --> 10

Example 2:
Input: n = 5
Output: [0,1,1,2,1,2]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101
 
Constraints: 0 <= n <= 105

Follow up:
It is very easy to come up with a solution with a runtime of O(n log n). Can you do it in linear time O(n) and possibly in a single pass?

Difficulty : easy

Approach : Bit Manipulation.
1. Initialize an array ans of size n + 1 to store the number of 1's for each integer from 0 to n.
2. Iterate through each integer i from 1 to n:
   a. Use the formula ans[i] = ans[i >> 1] + (i & 1) to calculate the number of 1's in the binary representation of i.
      - i >> 1 gives the integer obtained by removing the least significant bit of i.
      - (i & 1) checks if the least significant bit of i is 1 (if it is, add 1 to the count).
3. Return the ans array after processing all integers.  

Time Complexity: O(n) where n is the input integer, since we are iterating through all integers from 1 to n.
Space Complexity: O(n) for the ans array storing the number of 1's for each integer from 0 to n.
*/

class Solution {
    public int[] countBits(int n) {
        // int ans[] = new int[n+1];
        // ans[0] = 0;
        // for(int i = 1; i<n+1 ; i++){
        //     ans[i] = Integer.bitCount(i);
        // }
        
        // for (int i = 0; i <= n; i++) {
        //     int count = 0;
        //     int x = i;

        //     while (x > 0) {
        //         count += x & 1;
        //         x >>= 1;
        //     }

        //     ans[i] = count;
        // }
        int[] ans = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }
}