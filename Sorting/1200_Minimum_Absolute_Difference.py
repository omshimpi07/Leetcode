"""
1200. Minimum Absolute Difference

Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements.
Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows
a, b are from arr
a < b
b - a equals to the minimum absolute difference of any two elements in arr
 
Example 1: Input: arr = [4,2,1,3] Output: [[1,2],[2,3],[3,4]]
Explanation: The minimum absolute difference is 1. List all pairs with difference equal to 1 in ascending order.

Difficulty : easy

"""

class Solution:
    def minimumAbsDifference(self, arr: list[int]) -> list[list[int]]:
        # arr.sort()

        # minimum = float("inf")

        # # First pass: find the minimum difference
        # for i in range(1, len(arr)):

        #     difference = abs(arr[i] - arr[i - 1])

        #     if difference < minimum:
        #         minimum = difference

        # result = []

        # # Second pass: collect pairs with the minimum difference
        # for i in range(1, len(arr)):

        #     difference = abs(arr[i] - arr[i - 1])

        #     if difference == minimum:
        #         result.append([arr[i - 1], arr[i]])

        # return result


        result = []
        minimum = float("inf")

        arr.sort()

        for i in range(1, len(arr)):

            difference = abs(arr[i] - arr[i - 1])

            if difference < minimum:
                minimum = difference
                result.clear()

            if difference == minimum:
                result.append([arr[i - 1], arr[i]])

        return result