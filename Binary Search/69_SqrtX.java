/*
69. Sqrt(x)

Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
You must not use any built-in exponent function or operator.
For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 

Example 1: Input: x = 4 Output: 2
Explanation: The square root of 4 is 2, so we return 2.

Difficulty : Easy
Approach : Binary Search.
1. If x is less than 2, return x as the square root of 0 and 1 is the number itself.
2. Initialize two pointers, left and right, to 1 and x/2 respectively. The square root of x will always be less than or equal to x/2 for x >= 2.
3. Use a while loop to perform binary search until left is less than or equal to right.
4. Calculate the mid-point between left and right.
5. Check if mid * mid is less than or equal to x. If it is, update the answer to mid and move the left pointer to mid + 1 to search for a larger square root.
6. If mid * mid is greater than x, move the right pointer to mid - 1 to search for a smaller square root.
7. After the loop ends, return the answer which will be the largest integer whose square is less than or equal to x.
8. To avoid potential overflow when calculating mid * mid, use mid <= x / mid instead of mid * mid <= x.
Time Complexity: O(log(x)) for the binary search.
Space Complexity: O(1) since we are using a constant amount of space for the variables.

*/

class Solution {
    public int mySqrt(int x) {
        
        if (x < 2) {
            return x;
        }

        int left = 1;
        int right = x / 2;
        int ans = 0;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (mid <= x / mid) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }
}