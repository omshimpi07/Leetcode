/*
3411. Maximum Subarray With Equal Products

You are given an array of positive integers nums.
An array arr is called product equivalent if prod(arr) == lcm(arr) * gcd(arr), where:
prod(arr) is the product of all elements of arr.
gcd(arr) is the GCD of all elements of arr.
lcm(arr) is the LCM of all elements of arr.
Return the length of the longest product equivalent subarray of nums.

Example 1: Input: nums = [1,2,1,2,1,1,1] Output: 5

Explanation: The longest product equivalent subarray is [1, 2, 1, 1, 1], where prod([1, 2, 1, 1, 1]) = 2, gcd([1, 2, 1, 1, 1]) = 1, and lcm([1, 2, 1, 1, 1]) = 2.

Difficulty : Easy
*/

class Solution {
    public int maxLength(int[] nums) {
        
        
        int maxLength = 0;

        for(int i = 0; i< nums.length; i++){
            
            long product = 1;
            int currentGCD = 0;
            int currentLCM = 1;

            for(int j = i; j < nums.length ; j++){
                
                product *= nums[j];

                currentGCD = gcd(currentGCD, nums[j]);
                currentLCM = lcm(currentLCM, nums[j]);

                long comparison = (long) currentGCD * currentLCM;

                if (product == comparison) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }

                if (product > comparison) {
                    break;
                }

            }
            
        }
        return maxLength;
        
    }

    private int gcd(int a, int b) {

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }

    private int lcm(int a, int b) {

        return (a / gcd(a, b)) * b;
    }
}