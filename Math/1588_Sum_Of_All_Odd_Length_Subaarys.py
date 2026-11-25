"""
1588. Sum of All Odd Length Subarrays

Given an array of positive integers arr, return the sum of all possible odd-length subarrays of arr.

A subarray is a contiguous subsequence of the array.

Example 1: Input: arr = [1,4,2,5,3] Output: 58
Explanation: The odd-length subarrays of arr and their sums are:
[1] = 1
[4] = 4
[2] = 2
[5] = 5
[3] = 3
[1,4,2] = 7
[4,2,5] = 11
[2,5,3] = 10
[1,4,2,5,3] = 15

Difficulty : Easy
"""

class Solution:
    def sumOddLengthSubarrays(self, arr: list[int]) -> int:
        # total = 0

        # for i in range(len(arr)):
        #     total += arr[i]

        # odd = 3

        # while odd <= len(arr):

        #     for i in range(len(arr) - odd + 1):

        #         sub_array = arr[i : i + odd]

        #         for j in range(len(sub_array)):
        #             total += sub_array[j]

        #     odd += 2

        # return total

        total = 0
        odd = 1

        while odd <= len(arr):

            for i in range(len(arr) - odd + 1):

                for j in range(i, i + odd):
                    total += arr[j]

            odd += 2

        return total