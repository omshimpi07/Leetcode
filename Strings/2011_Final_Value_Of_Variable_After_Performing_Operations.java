/*
2011. Final Value of Variable After Performing Operations

There is a programming language with only four operations and one variable X:

++X and X++ increments the value of the variable X by 1.
--X and X-- decrements the value of the variable X by 1.
Initially, the value of X is 0.

Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.

Example 1: Input: operations = ["--X","X++","X++"] Output: 1
Explanation: The operations are performed as follows:
Initially, X = 0.
--X: X is decremented by 1, X =  0 - 1 = -1.
X++: X is incremented by 1, X = -1 + 1 =  0.
X++: X is incremented by 1, X =  0 + 1 =  1.

Difficulty : easy

Approach : String.
1. Initialize a variable x to 0.
2. Iterate through each operation in the operations array.  
    a. If the operation contains "++", increment x by 1.
     b. If the operation contains "--", decrement x by 1.
3. Return the final value of x after processing all operations.
Time Complexity: O(n) where n is the number of operations, since we iterate through the operations array once.
Space Complexity: O(1) since we are using a constant amount of space for the variable x.

 */

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        // int x = 0;

        // for (String op : operations) {

        //     if (op.contains("++")) {
        //         x++;
        //     } else {
        //         x--;
        //     }
        // }

        // return x;

        int x = 0;

        for (String op : operations) {

            if (op.charAt(1) == '+')
                x++;
            else
                x--;
        }

        return x;
    }
}