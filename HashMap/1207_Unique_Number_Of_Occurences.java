/*
1207. Unique Number of Occurrences
Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.

Example 1: Input: arr = [1,2,2,1,1,3] Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.

Example 2: Input: arr = [1,2] Output: false
Explanation: Both 1 and 2 have 1 occurrence.

Constraints: 1 <= arr.length <= 1000 and -1000 <= arr[i] <= 1000
Difficulty : easy
    
*/

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0;i<arr.length;i++){
            int preSum = arr[i];
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }
    
        HashSet<Integer> set = new HashSet<>();

        for (int freq : map.values()) {
            if (set.contains(freq)) {
                return false; 
            }
            set.add(freq);
        }

        return true;
    }
}