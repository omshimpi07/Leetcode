/*
2956. Find Common Elements Between Two Arrays

You are given two integer arrays nums1 and nums2 of sizes n and m, respectively. Calculate the following values:
answer1 : the number of indices i such that nums1[i] exists in nums2.
answer2 : the number of indices i such that nums2[i] exists in nums1.
Return [answer1,answer2].

Example 1: Input: nums1 = [2,3,2], nums2 = [1,2] Output: [2,1]

*/


class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        boolean[] present1 = new boolean[101];
        boolean[] present2 = new boolean[101];

        for (int num : nums1) {
            present1[num] = true;
        }

        for (int num : nums2) {
            present2[num] = true;
        }

        int answer1 = 0;
        int answer2 = 0;

        for (int num : nums1) {
            if (present2[num]) {
                answer1++;
            }
        }

        for (int num : nums2) {
            if (present1[num]) {
                answer2++;
            }
        }

        return new int[]{answer1, answer2};
    }
}