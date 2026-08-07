/*
1108. Defanging an IP Address

Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

Example 1: Input: address = "1.1.1.1" Output: "1[.]1[.]1[.]1"
Difficulty : easy

Approach : StringBuilder.
1. Create a StringBuilder to build the defanged IP address.
2. Iterate through each character of the input address string.
3. If the character is a period '.', append "[.]" to the StringBuilder.
4. If the character is not a period, append the character itself to the StringBuilder.  
5. After processing all characters, convert the StringBuilder to a string and return it.

Time Complexity: O(n) where n is the length of the input address string, since we are iterating through the string once.    
Space Complexity: O(n) for the StringBuilder used to build the defanged IP address.
*/

class Solution {
    public String defangIPaddr(String address) {
        // return address.replace(".", "[.]");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < address.length(); i++) {

            char ch = address.charAt(i);

            if (ch == '.') {
                sb.append("[.]");
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}



