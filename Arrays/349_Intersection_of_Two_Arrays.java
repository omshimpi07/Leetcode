/*
349. Intersection of Two Arrays
link: https://leetcode.com/problems/intersection-of-two-arrays/description/
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2] Output: [2]
Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4 ] Output: [9,4]

Difficulty: Easy

Approach:
1. Use a nested loop to compare each element of nums1 with each element of nums2.
2. If a match is found and the element is not already in the result list, add the element to the result list.
3. Convert the result list to an array and return it.
Time Complexity: O(n * m) where n and m are the lengths of nums1 andnums2, respectively.
Space Complexity: O(k) where k is the number of unique elements in the intersection of nums

*/

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
            
            ArrayList<Integer> list = new ArrayList<>();

            for(int i = 0;i<nums1.length;i++){

                for(int j = 0; j<nums2.length;j++){

                    if(nums1[i] == nums2[j] && !list.contains(nums1[i])){

                        list.add(nums1[i]);
                        
                    }
                }
            }
            int[] result = new int[list.size()];

            for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
            }

        return result;
    }
}