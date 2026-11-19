"""
557. Reverse Words in a String III

Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1: Input: s = "Let's take LeetCode contest" Output: "s'teL ekat edoCteeL tsetnoc"
Example 2: Input: s = "Mr Ding" Output: "rM gniD"

Difficulty : Easy

"""

sb = []

        arr = list(s)

        start = 0

        for end in range(len(arr) + 1):

            if end == len(arr) or arr[end] == ' ':

                for j in range(end - 1, start - 1, -1):
                    sb.append(arr[j])

                if end < len(arr):
                    sb.append(' ')

                start = end + 1

        return "".join(sb)