/*
557. Reverse Words in a String III

Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1: Input: s = "Let's take LeetCode contest" Output: "s'teL ekat edoCteeL tsetnoc"
Example 2: Input: s = "Mr Ding" Output: "rM gniD"

Difficulty : Easy
*/

class Solution {
    public String reverseWords(String s) {
        

        StringBuilder sb = new StringBuilder();

        char[] arr = s.toCharArray();

        int start = 0;

        for (int end = 0; end <= arr.length; end++) {

            if (end == arr.length || arr[end] == ' ') {

                for (int j = end - 1; j >= start; j--) {
                    sb.append(arr[j]);
                }

                if (end < arr.length) {
                    sb.append(' ');
                }

                start = end + 1;
            }
        }

        return sb.toString();


    }
}