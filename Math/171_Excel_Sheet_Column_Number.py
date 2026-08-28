"""
171.Excel Sheet Column Number
Given A String columnTitle that represents the column title as appears in an excel sheet , return its corresponding column number

Example 1: Input : columTitle = "A" output : 1

Example 2: Input : columnTitle = "AB" output = 28

Diificulty : Easy

"""

class Solution:
    def titleToNumber(self, columnTitle: str) -> int:
        result = 0

        for ch in columnTitle:
            value = ord(ch) - ord('A') + 1
            result = result * 26 + value

        return result