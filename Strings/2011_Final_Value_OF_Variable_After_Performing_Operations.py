    """
    2011. Final Value of Variable After Performing Operations
Solved
Easy
Topics
premium lock icon
Companies
Hint
There is a programming language with only four operations and one variable X:

++X and X++ increments the value of the variable X by 1.
--X and X-- decrements the value of the variable X by 1.
Initially, the value of X is 0.

Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.

 

Example 1:

Input: operations = ["--X","X++","X++"]
Output: 1
Explanation: The operations are performed as follows:
Initially, X = 0.
--X: X is decremented by 1, X =  0 - 1 = -1.
X++: X is incremented by 1, X = -1 + 1 =  0.
X++: X is incremented by 1, X =  0 + 1 =  1.

Difficulty: Easy

Approach:
1. Initialize a variable x to 0 to keep track of the value of X.
2. Iterate through each operation in the operations list:
    a. If the operation contains "++", increment x by 1.
    b. If the operation contains "--", decrement x by 1.
3. Return the final value of x after processing all operations.

Time Complexity: O(n), where n is the number of operations in the input list.   
Space Complexity: O(1), as we are using a constant amount of space regardless of the input size.

    """

from typing import List


class Solution:
    def finalValueAfterOperations(self, operations: List[str]) -> int:


        # x = 0

        # for op in operations:

        #     if "++" in op:
        #         x += 1
        #     else:
        #         x -= 1

        # return x

        x = 0

        for op in operations:

            if op[1] == "+":
                x += 1
            else:
                x -= 1

        return x