"""
3794. Reverse String Prefix

You are given a string s and an integer k.
Reverse the first k characters of s and return the resulting string.

Example 1: Input: s = "abcd", k = 2 Output: "bacd"
Explanation:​​​​​​​ The first k = 2 characters "ab" are reversed to "ba". The final resulting string is "bacd".

Difficulty: Easy

Approach:
1.Two pointer , 0 to k-1 , whiel loop traverse , normal swal increse the left and decrese the right.

"""

class Solution:
    def reversePrefix(self, s: str, k: int) -> str:

        arr = list(s)

        left = 0
        right = k - 1

        while left < right:

            temp = arr[left]
            arr[left] = arr[right]
            arr[right] = temp

            left += 1
            right -= 1

        return "".join(arr)