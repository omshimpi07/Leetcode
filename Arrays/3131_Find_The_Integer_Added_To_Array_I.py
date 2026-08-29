"""
3131. Find the Integer Added to Array |

you ar egiven two arrays of equal length, nums1 and nums2.
Each element in nums1 had been increassed(or decresed in the case of negativ) by an integer, represented by the variable x.
As a result, nums1 becomes equal to nums2.Two arrays are considered equal when they contain the same integers with the same frequencies.
return the integer x.

example 1: Input : nums1 = [2,3,4], nums2 = [9,7,5]
output : 3
Explanation : The integer added to each element of nums1 is 3.

Difficult : Easy
    
    
"""

class Solution:
    def addedInteger(self, nums1: List[int], nums2: List[int]) -> int:
        return min(nums2) - min(nums1)
