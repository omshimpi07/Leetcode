"""
1299. Replace Elements with Greatest Element on Right Side

Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
After doing so, return the array.

Example 1: Input: arr = [17,18,5,4,6,1] Output: [18,6,6,6,1,-1]
Explanation: 
- index 0 --> the greatest element to the right of index 0 is index 1 (18).
- index 1 --> the greatest element to the right of index 1 is index 4 (6).
- index 2 --> the greatest element to the right of index 2 is index 4 (6).
- index 3 --> the greatest element to the right of index 3 is index 4 (6).
- index 4 --> the greatest element to the right of index 4 is index 5 (1).
- index 5 --> there are no elements to the right of index 5, so we put -1.
 
Difficulty : easy

Appraoch : Array.
1. Initialize a variable `greatest` to -1, which will keep track of the greatest element found so far from the right.
2. Just simple forr loop for end to start
3. assign arr[i] to current , check current greater than greater , and allocate the greater = current and continue the inplace array substituion

Time Complexity : O(n)
Space Complexity : O(n)

"""

class Solution:
    def replaceElements(self, arr: list[int]) -> list[int]:
        # greatest = -1

        # result = []

        # for i in range(len(arr) - 1, -1, -1):

        #     result.append(greatest)

        #     if arr[i] > greatest:
        #         greatest = arr[i]

        # result.reverse()

        # return result

        greatest = -1

        for i in range(len(arr) - 1, -1, -1):

            current = arr[i]
            arr[i] = greatest

            if current > greatest:
                greatest = current

        return arr