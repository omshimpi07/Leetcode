/*
482. License Key Formatting

You are given a license key represented as a string s that consists of only alphanumeric characters and dashes. The string is separated into n + 1 groups by n dashes. You are also given an integer k.
We want to reformat the string s such that each group contains exactly k characters, except for the first group, which could be shorter than k but still must contain at least one character. Furthermore, there must be a dash inserted between two groups, and you should convert all lowercase letters to uppercase.
Return the reformatted license key.

Example 1: Input: s = "5F3Z-2e-9-w", k = 4 Output: "5F3Z-2E9W"
Explanation: The string s has been split into two parts, each part has 4 characters.
Note that the two extra dashes are not needed and can be removed.

Diifficulty : Easy

*/

class Solution {
    public String licenseKeyFormatting(String s, int k) {
        
        //backward brute force
        // StringBuilder sb = new StringBuilder();
        
        // String S = s.replace("-", "").toUpperCase();
        // int count = 0;
        // for(int i = S.length()-1 ; i>= 0 ; i--){

        //     sb.append(S.charAt(i));
        //     count++;

        //     if (count == k && i > 0) {
        //         sb.append("-");
        //         count = 0;
        //     }
        // }

        // return sb.reverse().toString();

        //backward approach with groups calculation
        // s = s.replace("-", "").toUpperCase();

        // StringBuilder sb = new StringBuilder();

        // int end = s.length();

        // while (end > 0) {

        //     int start = Math.max(0, end - k);

        //     // Take this group backwards
        //     for (int j = end - 1; j >= start; j--) {
        //         sb.append(s.charAt(j));
        //     }

        //     // Add dash if characters are still remaining
        //     if (start > 0) {
        //         sb.append("-");
        //     }

        //     end = start;
        // }

        // return sb.reverse().toString();

        //Forward Appraoch
        // Remove '-' and convert everything to uppercase
        String clean = s.replace("-", "").toUpperCase();

        int n = clean.length();

        if (n == 0) {
            return "";
        }

        int first = n % k;

        if (first == 0) {
            first = k;
        }

        StringBuilder sb = new StringBuilder();

        sb.append(clean.substring(0, first));

        for (int i = first; i < n; i += k) {
            sb.append("-");
            sb.append(clean.substring(i, i + k));
        }

        return sb.toString();

    }
}