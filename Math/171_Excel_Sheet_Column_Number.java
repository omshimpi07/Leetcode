/*
171.Excel Sheet Column Number
Given A String columnTitle that represents the column title as appears in an excel sheet , return its corresponding column number

Example 1: Input : columTitle = "A" output : 1

Example 2: Input : columnTitle = "AB" output = 28

Difficulty : Easy

Approach : Math

*/

class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;

        for (int i = 0; i < columnTitle.length(); i++) {

            char ch = columnTitle.charAt(i);

            result = result * 26 + (ch - 'A' + 1);
        }

        return result;
    }
}