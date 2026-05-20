/*  
2215. Find the Difference of Two Arrays
Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
answer[1] is a list of all distinct integers in nums2 which are not present in nums1.

Example 1: Input: nums1 = [1,2,3], nums2 = [2,4,6] Output: [[1,3],[4,6]]
Explanation:
For nums1, nums1[1] = 2 is present at index 0 of    
nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
For nums2, nums2[0] = 2 is present at index 1 of    
nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums1. Therefore, answer[1] = [4,6].        

Example 2: Input: nums1 = [1,2,3,3], nums2 = [1,3,5] Output: [[2],[5]]
Explanation:    
For nums1, nums1[0] = 1 is present at index 0 of
nums2, whereas nums1[1] = 2 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [2,3]. However, the integers in the lists may be returned in any order, so answer[0] may be [3,2].
For nums2, nums2[0] = 1 is present at index 0 of
nums1, therefore, answer[1] = [5].

Difficulty : easy

Approach:
1. Create two HashSet to store the distinct integers from nums1 and nums2 for O(1) lookups. 
2. Iterate through the first HashSet and check if each integer is not present in the second HashSet. If it is not present, add it to the first list in the answer.
3. Iterate through the second HashSet and check if each integer is not present in the first
HashSet. If it is not present, add it to the second list in the answer.

Time Complexity: O(n + m) where n is the length of nums1 and m is the length of nums2, since we are iterating through both arrays to populate the HashSets and then iterating through the HashSets to find the differences.
Space Complexity: O(n + m) for the HashSets and the result lists, where n is the number of distinct integers in nums1 and m is the number of distinct integers in nums2.

*/

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> list = new ArrayList<>();

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int i = 0; i<nums1.length;i++){
            int presum = nums1[i];
            set1.add(presum);
        }
        for(int i = 0; i<nums2.length;i++){
            int presum1 = nums2[i];
            set2.add(presum1);
        }
        for(Integer key : set1){
            if(!set2.contains(key)) {
                a.add(key);
            }
        }
        for(Integer key : set2){
            if(!set1.contains(key)){
                b.add(key);
            }
        }
        list.add(a);
        list.add(b);
        return list;
    }
}

