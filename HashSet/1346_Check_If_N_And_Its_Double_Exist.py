"""
1346. Check If N and Its Double Exist

Given an array arr of integers, check if there exist two indices i and j such that :
i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]
 
Example 1: Input: arr = [10,2,5,3] Output: true
Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]

Difficulty : easy

"""

class Solution:
    def checkIfExist(self, arr: list[int]) -> bool:
        # for i in range(len(arr)):

        #     for j in range(len(arr) - 1, -1, -1):

        #         if j != i and arr[i] * 2 == arr[j]:
        #             return True

        # return False

        seen = set()

        for x in arr:

            if 2 * x in seen or (x % 2 == 0 and x // 2 in seen):
                return True

            seen.add(x)

        return False