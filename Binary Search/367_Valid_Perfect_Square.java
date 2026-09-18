/*
367. Valid Perfect Square

Given a positive integer num, return true if num is a perfect square or false otherwise.
A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.
You must not use any built-in library function, such as sqrt.

Example 1: Input: num = 16 Output: true
Explanation: We return true because 4 * 4 = 16 and 4 is an integer.

DIfificulty : easy

Approach : Binary Search.
1. Use binary search to find the square root of the number.
2. Initialize two pointers, left and right, where left is 1 and right is num / 2.
3. While left is less than or equal to right, calculate the mid value as the average of left and right.
4. If mid * mid is equal to num, return true.
5. If mid * mid is less than num, move the left pointer to mid + 1.
6. If mid * mid is greater than num, move the right pointer to mid - 1.
7. If the loop ends without finding a perfect square, return false.

Time Complexity: O(log(num)) since we are using binary search to find the square root.
Space Complexity: O(1) since we are using a constant amount of space for the pointers

 */

class Solution {
    public boolean isPerfectSquare(int num) {
        
        if (num == 1) {
            return true;
        }
        int left = 1;
        int right = num / 2;
        boolean ans = false;

        while(left <= right){

            int mid = left + (right - left) / 2;

            if((long)mid * mid == num){
                return true;
            }

            else if((long)mid * mid < num){

                 left = mid + 1;
            } 
            else {

                right = mid - 1;
            }
        }

        return ans;

        
    }   
}