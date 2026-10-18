/*
3794. Reverse String Prefix

You are given a string s and an integer k.
Reverse the first k characters of s and return the resulting string.

Example 1: Input: s = "abcd", k = 2 Output: "bacd"
Explanation:​​​​​​​ The first k = 2 characters "ab" are reversed to "ba". The final resulting string is "bacd".

Difficulty: Easy

Approach:
1.Two pointer , 0 to k-1 , whiel loop traverse , normal swal increse the left and decrese the right.

*/

class Solution {
    public String reversePrefix(String s, int k) {
        
        char arr[] = s.toCharArray();

        int left = 0;
        int right = k -1;
        while(left < right){

            char temp = s.charAt(left);
            arr[left] = arr[right];
            arr[right] = temp; 

            left++;
            right--;
        }

        String str = new String(arr);

        return str;
    }
}