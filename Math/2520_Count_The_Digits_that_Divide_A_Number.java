/* 
2520. Count the Digits that Divide a Number

Given an integer num, return the number of digits in num that divide num.
An integer val divides nums if nums % val == 0.

Example 1: Input: num = 7 Output: 1
Explanation: 7 divides itself, hence the answer is 1.

Difficulty: Easy

Approach:
1. Initialize a variable count to 0 to keep track of the number of digits that divide
2. Create a temporary variable temp2 and assign it the value of num.
3. Use a while loop to iterate through each digit of temp2 until it becomes 03
4. Inside the loop, extract the last digit of temp2 using the modulus operator (%).
5. Check if the digit is not zero and if num is divisible by the digit (num
    % digit == 0). If both conditions are true, increment the count by 1.
6. Remove the last digit from temp2 by performing integer division by 10 (temp2 /= 10).
7. After the loop ends, return the final value of count.


Time Complexity: O(log n) - The solution involves iterating through the digits of num, which takes logarithmic time in relation to the number of digits.
Space Complexity: O(1) - The solution uses a constant amount of space for variables and

*/

class Solution {
    public int countDigits(int num) {
        
        int count = 0;

        int temp2 = num;
        while(temp2 > 0){

            int temp = temp2 % 10;

            if(num % temp == 0){
                count++;
            }

            temp2 /= 10;
        }

        return count;

    }
}