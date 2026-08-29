/*
3131. Find the Integer Added to Array |

you ar egiven two arrays of equal length, nums1 and nums2.
Each element in nums1 had been increassed(or decresed in the case of negativ) by an integer, represented by the variable x.
As a result, nums1 becomes equal to nums2.Two arrays are considered equal when they contain the same integers with the same frequencies.
return the integer x.

example 1: Input : nums1 = [2,3,4], nums2 = [9,7,5]
output : 3
Explanation : The integer added to each element of nums1 is 3.

Difficult : Easy

*/
class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        
        int min1 = nums1[0];
        int min2 = nums2[0];
        for(int i = 0; i<nums1.length; i++){

            min1 = Math.min(min1,nums1[i]);
            min2 = Math.min(min2,nums2[i]);
            
        }
        return min2 - min1;
    
    }
}
