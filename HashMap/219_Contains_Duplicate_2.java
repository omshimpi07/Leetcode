/*
219. Contains Duplicate II
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

Example 1: Input: nums = [1,2,3,1], k = 3 Output: true
Example 2: Input: nums = [1,0,1,1], k = 1 Output: true
Example 3: Input: nums = [1,2,3,1,2,3], k = 2 Output: false

Difficulty : easy

Approach:
1. Create a HashMap to store the last index of each integer encountered in the array.
2. Iterate through the array, and for each integer:
    - Check if it is already present in the HashMap. If it is, calculate the absolute difference between the current index and the last index stored in the HashMap.
    - If the absolute difference is less than or equal to k, return true.
    - Update the HashMap with the current index for the integer.    
3. If the loop completes without finding any such pair of indices, return false.
Time Complexity: O(n) where n is the length of the input array, since we are
iterating through the array once.
Space Complexity: O(n) in the worst case, if all integers in the array are distinct

*/
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i<nums.length ; i++){

            if(map.containsKey(nums[i])){
                int prevIndex = map.get(nums[i]);
                if(i - prevIndex <= k){
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}