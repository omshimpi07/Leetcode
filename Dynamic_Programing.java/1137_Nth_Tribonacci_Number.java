/*
1137. Nth Tribonacci Number
The Tribonacci sequence Tn is defined as follows:
T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
Given n, return the value of Tn.

Example 1: Input: n = 4 Output: 4   
Explanation:
T_3 = 0 + 1 + 1 = 2
T_4 = 1 + 1 + 2 = 4

Example 2: Input: n = 25 Output: 1389537

Difficulty : easy

Approach : Dynamic Programming.
1. Use three variables to keep track of the last three Tribonacci numbers.
2. Initialize the first three Tribonacci numbers: T0 = 0, T1 = 1, T2 = 1.
3. Iterate from 3 to n, calculating the next Tribonacci number as the sum of the last three numbers.
4. Update the last three numbers accordingly.
5. Return the nth Tribonacci number after the loop.

Time Complexity: O(n) since we are iterating from 3 to n.
Space Complexity: O(1) since we are using a constant amount of space for the last three numbers.

*/

class Solution {
    public int tribonacci(int n) {

        if (n == 0){
            return 0;
        }
        if (n == 1 || n == 2){
            return 1;
        }
        int a = 0;
        int b = 1;
        int c = 1;

        for (int i = 3; i <= n; i++) {

            int next = a + b + c;
            a = b;
            b = c;
            c = next;
        }
        return c;
    }
}