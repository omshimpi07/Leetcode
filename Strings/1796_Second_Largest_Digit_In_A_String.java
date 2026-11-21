/*
1796. Second Largest Digit in a String

Given an alphanumeric string s, return the second largest numerical digit that appears in s, or -1 if it does not exist.
An alphanumeric string is a string consisting of lowercase English letters and digits.

Example 1: Input: s = "dfa12321afd" Output: 2
Explanation: The digits that appear in s are [1, 2, 3]. The second largest digit is 2.
Example 2: Input: s = "abc1111" Output: -1
Explanation: The digits that appear in s are [1]. There is no second largest digit. 
 
Difficulty : Easy
*/

class Solution {
    public int secondHighest(String s) {
        
        int largest = -1;
        int second = -1;

        for(int i = 0; i< s.length(); i++){

            char ch = s.charAt(i);

            if (ch >= '0' && ch <= '9') {

                int digit = ch - '0';

                if (digit > largest) {
                    second = largest;
                    largest = digit;
                }
                else if (digit < largest && digit > second) {
                    second = digit;
                }
            }
        }

        return second;

        // List<Integer> digits = new ArrayList<>();

        // for (int i = 0; i < s.length(); i++) {

        //     char ch = s.charAt(i);

        //     if (ch >= '0' && ch <= '9') {
        //         digits.add(ch - '0');
        //     }
        // }

        // Collections.sort(digits);

        // if (digits.size() < 2) {
        //     return -1;
        // }

        // int largest = digits.get(digits.size() - 1);

        // for (int i = digits.size() - 2; i >= 0; i--) {

        //     if (digits.get(i) != largest) {
        //         return digits.get(i);
        //     }
        // }

        // return -1;

        // int largest = -1;

        // for (int i = 0; i < s.length(); i++) {

        //     char ch = s.charAt(i);

        //     if (ch >= '0' && ch <= '9') {

        //         int digit = ch - '0';

        //         if (digit > largest) {
        //             largest = digit;
        //         }
        //     }
        // }
        // int second = -1;

        // for (int i = 0; i < s.length(); i++) {

        //     char ch = s.charAt(i);

        //     if (ch >= '0' && ch <= '9') {

        //         int digit = ch - '0';

        //         if (digit < largest && digit > second) {
        //             second = digit;
        //         }
        //     }
        // }

        // return second;

    }
}