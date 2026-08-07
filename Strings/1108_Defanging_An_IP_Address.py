"""1108. Defanging an IP Address

Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

Example 1: Input: address = "1.1.1.1" Output: "1[.]1[.]1[.]1"
Difficulty : easy
"""
class Solution:
    def defangIPaddr(self, address: str) -> str:

        result = []

        for ch in address:

            if ch == ".":
                result.append("[.]")
            else:
                result.append(ch)

        return "".join(result)