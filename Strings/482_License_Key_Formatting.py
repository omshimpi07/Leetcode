"""
482. License Key Formatting

You are given a license key represented as a string s that consists of only alphanumeric characters and dashes. The string is separated into n + 1 groups by n dashes. You are also given an integer k.
We want to reformat the string s such that each group contains exactly k characters, except for the first group, which could be shorter than k but still must contain at least one character. Furthermore, there must be a dash inserted between two groups, and you should convert all lowercase letters to uppercase.
Return the reformatted license key.

Example 1: Input: s = "5F3Z-2e-9-w", k = 4 Output: "5F3Z-2E9W"
Explanation: The string s has been split into two parts, each part has 4 characters.
Note that the two extra dashes are not needed and can be removed.

Diifficulty : Easy

"""

class Solution:
    def licenseKeyFormatting(self, s: str, k: int) -> str:
        # clean = s.replace("-", "").upper()

        # result = []
        # count = 0

        # for i in range(len(clean) - 1, -1, -1):

        #     result.append(clean[i])
        #     count += 1

        #     if count == k and i > 0:
        #         result.append("-")
        #         count = 0

        # result.reverse()

        # return "".join(result)

        #2
        # clean = s.replace("-", "").upper()

        # result = []

        # end = len(clean)

        # while end > 0:

        #     start = max(0, end - k)

        #     for j in range(end - 1, start - 1, -1):
        #         result.append(clean[j])

        #     if start > 0:
        #         result.append("-")

        #     end = start

        # result.reverse()

        # return "".join(result)

        #3
        clean = s.replace("-", "").upper()

        n = len(clean)

        if n == 0:
            return ""

        first = n % k

        if first == 0:
            first = k

        result = []

        result.append(clean[:first])

        for i in range(first, n, k):
            result.append("-")
            result.append(clean[i:i + k])

        return "".join(result)