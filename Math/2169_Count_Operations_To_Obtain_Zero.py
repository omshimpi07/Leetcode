"""
2169. Count Operations to Obtain Zero

You are given two non-negative integers num1 and num2.
In one operation, if num1 >= num2, you must subtract num2 from num1, otherwise subtract num1 from num2.
For example, if num1 = 5 and num2 = 4, subtract num2 from num1, thus obtaining num1 = 1 and num2 = 4. However, if num1 = 4 and num2 = 5, after one operation, num1 = 4 and num2 = 1.
Return the number of operations required to make either num1 = 0 or num2 = 0.

Example 1: Input: num1 = 2, num2 = 3
Output: 3 Explanation: 
- Operation 1: num1 = 2, num2 = 3. Since num1 < num2, we subtract num1 from num2 and get num1 = 2, num2 = 3 - 2 = 1.
- Operation 2: num1 = 2, num2 = 1. Since num1 > num2, we subtract num2 from num1.
- Operation 3: num1 = 1, num2 = 1. Since num1 == num2, we subtract num2 from num1.
Now num1 = 0 and num2 = 1. Since num1 == 0, we do not need to perform any further operations.
So the total number of operations required is 3.

Difficulty: Easy

Approach:
1. Initialize a counter to keep track of the number of operations performed.
2. Use a while loop to continue performing operations until either num1 or num2 becomes zero.
3. Inside the loop, check if num1 is greater than or equal to num2. If it is, subtract num2 from num1 and increment the counter.
4. If num1 is less than num2, subtract num1 from num2 and increment the counter.
5. Return the counter as the result.

Time Complexity: O(log(max(num1, num2))) - In each operation, we reduce the larger number by at least half, leading to a logarithmic number of operations.
Space Complexity: O(1) - We are using a constant amount of space for the counter and the input variables.

"""

class Solution:
    def countOperations(self, num1: int, num2: int) -> int:
        # count = 0

        # while num1 > 0 and num2 > 0:

        #     if num1 >= num2:
        #         num1 -= num2
        #     else:
        #         num2 -= num1

        #     count += 1

        # return count

        count = 0

        while num1 > 0 and num2 > 0:

            if num1 >= num2:
                count += num1 // num2
                num1 %= num2

            else:
                count += num2 // num1
                num2 %= num1

        return count