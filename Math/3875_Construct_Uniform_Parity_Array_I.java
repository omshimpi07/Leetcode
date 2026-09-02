/*
3875. Construct Uniform Parity Array I

You are given an array nums1 of n distinct integers.
You want to construct another array nums2 of length n such that the elements in nums2 are either all odd or all even.
For each index i, you must choose exactly one of the following (in any order):
nums2[i] = nums1[i]
nums2[i] = nums1[i] - nums1[j], for an index j != i
Return true if it is possible to construct such an array, otherwise, return false.

Example 1: Input: nums1 = [2,3] Output: true
Explanation:
Choose nums2[0] = nums1[0] - nums1[1] = 2 - 3 = -1.
Choose nums2[1] = nums1[1] = 3.
nums2 = [-1, 3], and both elements are odd. Thus, the answer is true​​​​​​​.

Diificulty : easy

Approach : Math.
1. If all numbers are already even or all are already odd, we can simply choose nums2[i] = nums1[i].
2. Otherwise, nums1 contains both an even and an odd number. Keep every odd number as it is. For every even number, subtract any odd number: even - odd = odd. Therefore, we can ALWAYS make nums2 entirely odd.

Time Complexity: O(n) where n is the length of the input array nums1, since we iterate through the array to check the parity of each number.
Space Complexity: O(1) since we are using a constant amount of space for the calculations.

*/

class Solution {
    public boolean uniformArray(int[] nums1) {

        // // Already uniform?
        // boolean even = true;
        // boolean odd = true;

        // for (int i = 0; i < nums1.length; i++) {
        //     if (nums1[i] % 2 != 0)
        //         even = false;

        //     if (nums1[i] % 2 == 0)
        //         odd = false;
        // }

        // if (even || odd)
        //     return true;


        // // Try constructing nums2 with all odd values
        // int[] nums2 = new int[nums1.length];

        // for (int i = 0; i < nums1.length; i++) {

        //     // Keep it if already odd
        //     if (nums1[i] % 2 != 0) {
        //         nums2[i] = nums1[i];
        //         continue;
        //     }

        //     // Otherwise find some j that makes it odd
        //     boolean found = false;

        //     for (int j = 0; j < nums1.length; j++) {

        //         if (i != j) {
        //             int value = nums1[i] - nums1[j];

        //             if (value % 2 != 0) {
        //                 nums2[i] = value;
        //                 found = true;
        //                 break;
        //             }
        //         }
        //     }

        //     if (!found)
        //         return false;
        // }

        // // Check nums2
        // for (int i = 0; i < nums2.length; i++) {
        //     if (nums2[i] % 2 == 0)
        //         return false;
        // }

        // return true;
        // If all numbers are already even or all are already odd,
        // we can simply choose nums2[i] = nums1[i].
        boolean even = true;
        boolean odd = true;

        for (int num : nums1) {
            if (num % 2 == 0)
                odd = false;
            else
                even = false;
        }

        if (even || odd)
            return true;

        // Otherwise, nums1 contains both an even and an odd number.
        // Keep every odd number as it is.
        // For every even number, subtract any odd number:
        // even - odd = odd.
        //
        // Therefore, we can ALWAYS make nums2 entirely odd.
        return true;
    }
}