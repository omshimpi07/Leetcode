/*
1071. Greatest Common Divisor of Strings
For two strings s and t, we say "t divides s" if and only if s = t + ... + t (t concatenated with itself 1 or more times).
Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

Example 1: Input: str1 = "ABCABC", str2 = "ABC" Output: "ABC"
Example 2: Input: str1 = "ABABAB", str2 = "ABAB" Output: "AB"
Example 3: Input: str1 = "LEET", str2 = "CODE" Output: ""

str1 and str2 consist of English uppercase letters.
Difficulty : easy
Approach:
1. Find the length of the greatest common divisor (GCD) of the lengths of str1 and str2. This can be done using the Euclidean algorithm.
2. Extract the substring of str1 from index 0 to the GCD length. This substring is a candidate for the greatest common divisor string.
3. Check if this candidate substring can be concatenated to form both str1 and str2
4. If it can, return the candidate substring. Otherwise, return an empty string.
Time Complexity: O(n) where n is the length of the longer string between str1 and
str2, since we need to check the candidate substring against both strings.
Space Complexity: O(n) for storing the candidate substring and the result string.       

*/
class Solution {
    public String gcdOfStrings(String str1, String str2) {

    if((str1 + str2).equals(str2 + str1)){
        int a = str1.length();
        int b = str2.length();
        int gcd = gcd(a,b);
        return str1.substring(0,gcd);

    }
    else{
        return "";
        }
    }
    private int gcd(int a , int b){
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
    
}

