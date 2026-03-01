/*  
88. Merge Sorted Array  

Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
The number of elements initialized in nums1 and nums2 are m and n respectively. You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.

Example 1:
Input: nums1 = [1,2,3,0,0,0], m= 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]

Example 2:
Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]

Example 3:  
Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]

Difficulty: Easy

Approach:
1. Use three pointers: one for the end of nums1, one for the end of
    nums2, and one for the end of the merged array.
2. Compare elements from the end of nums1 and nums2, and place the larger one at the end of nums1.
3. Move the pointers accordingly until all elements from nums2 are merged into nums1.

Time Complexity: O(m + n)
Space Complexity: O(1)

 */

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
       int idx = m + n -1;
       int i = m-1;
       int j = n-1; 

        while( i >=0 && j >= 0){

            if(nums1[i] >= nums2[j]){
                nums1[idx] = nums1[i];
                idx--;
                i--; 

            }
            else{
                nums1[idx] = nums2[j];
                idx--;
                j--;
            }

            
        }
        while(j>=0){

                nums1[idx] = nums2[j];
                idx--;
                j--;
            }
    System.out.println(nums1);
    }
}