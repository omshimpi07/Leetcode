"""
1122. Relative Sort Array
Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.       
Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2. Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.
Example 1: Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6] Output: [2,2,2,1,4,3,3,9,6,7,19]

Difficulty : easy

Approach : Counting Sort
1. Create a frequency array freq of size 1001 (since the maximum value in arr1 is 1000) and initialize all elements to 0.
2. Iterate through arr1 and count the frequency of each number, storing it in the freq array.       
3. Initialize an index variable to 0, which will be used to keep track of the position in arr1 where we will place the sorted elements.
4. Iterate through arr2 and for each number, place it in arr1 according to its frequency in the freq array. Decrease the frequency in freq after placing each number.
5. After placing all elements from arr2, iterate through the freq array and place the remaining elements in ascending order in arr1.
6. Return the sorted arr1.

Time Complexity : O(n + m) where n is the length of arr1 and m is the length of arr2.
Space Complexity : O(1) since we are using a constant amount of extra space for the frequency array.

"""

class Solution:
    def relativeSortArray(self, arr1: List[int], arr2: List[int]) -> List[int]:
        freq = [0] * 1001

        # Count frequency of every number
        for num in arr1:
            freq[num] += 1

        index = 0

        # Put arr2 elements first
        for num in arr2:
            while freq[num] > 0:
                arr1[index] = num
                index += 1
                freq[num] -= 1

        # Put remaining elements in ascending order
        for num in range(1001):
            while freq[num] > 0:
                arr1[index] = num
                index += 1
                freq[num] -= 1

        return arr1