/*
2413. Smallest Even Multiple

Given a positive integer n, return the smallest positive integer that is a multiple of both 2 and n.

Example 1: Input: n =  Output: 10
Explanation: The smallest multiple of both 5 and 2 is 10.
Example 2: Input: n = 6 Output: 6
Explanation: The smallest multiple of both 6 and 2 is 6. Note that a number is a multiple of itself.
 
Constraints: 1 <= n <= 150

Difficulty: Easy

Approach:
1. Check if n is even. If it is, return n as it is the smallest even multiple of itself.
2. If n is odd, return n * 2 as it will be the smallest even4 multiple of n.

Time Complexity: O(1) - The solution runs in constant time as it only involves a few arithmetic operations and a conditional check.
Space Complexity: O(1) - The solution uses a constant amount of space regardless of the input size.

*/

class Solution {
    public int smallestEvenMultiple(int n) {
        // int ans = 2;
        
        // while(true){
            
        //     if( ans % 2 == 0 && ans % n == 0 ){

        //         return ans;

        //     }
        //         ans += 2;
            
        // }

        if(n % 2 == 0){
            return n;
        }

        return n * 2;
        
    }
}