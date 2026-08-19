"""
67. Add Binary

Given two binary strings a and b, return their sum as a binary string.

Example 1: Input: a = "11", b = "1" Output: "100"
Example 2: Input: a = "1010", b = "1011" Output: "10101"
Approach : Two Pointers
1. Initialize two pointers i and j to the end of strings a and b respectively.
2. Initialize a carry variable to 0 and an empty result list.
3. While either pointer is valid or there is a carry:
    a. Calculate the total sum of the current digits and the carry.
    b. Append the least significant bit of the total to the result list.
    c. Update the carry for the next iteration.
4. After the loop, reverse the result list and join it to form the final binary string.

Time Complexity : O(max(len(a), len(b))) where len(a) and len(b) are the lengths of the input strings.
Space Complexity : O(max(len(a), len(b))) for the result list.

"""
class Solution:
    def addBinary(self, a, b):
        i = len(a) - 1
        j = len(b) - 1
        carry = 0

        result = []

        while i >= 0 or j >= 0 or carry:

            total = carry

            if i >= 0:
                total += int(a[i])
                i -= 1

            if j >= 0:
                total += int(b[j])
                j -= 1

            result.append(str(total % 2))
            carry = total // 2

        return ''.join(reversed(result))