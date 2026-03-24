/*
415. Add Strings
Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.

Example 1: Input: num1 = "11", num2 = "123" Output: "134"

Difiiculty : easy
*/
class Solution {
    public String addStrings(String num1, String num2) {
        
        StringBuilder ans = new StringBuilder();
        
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        while(i >= 0 || j >= 0 || carry != 0){
            
            int sum = carry;

            if(i >= 0){
                sum += num1.charAt(i) - '0';
                i--;
            }
            if(j >= 0){
                sum += num2.charAt(j) - '0';
                j--;
            }
            ans.append(sum % 10);
            carry = sum / 10;
        }
        return ans.reverse().toString();
    

    }
}