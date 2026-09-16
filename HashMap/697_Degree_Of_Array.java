/*
697.Degree of an Array
Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements.
Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.

Example 1: Input: nums = [1,2,2,3,1] Output: 2
Explanation: 
The input array has a degree of 2 because both elements 1 and 2 appear twice.
Of the subarrays that have the same degree:
[1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
The shortest length is 2. So return 2.

Difficulty : easy

Approach : HashMap.
1. Use three HashMaps to store the frequency, first occurrence index, and last occurrence index of each element in the array.
2. Iterate through the array to populate these HashMaps.
3. Determine the degree of the array by finding the maximum frequency from the frequency HashMap.
4. Iterate through the keys of the frequency HashMap to find the elements that have the same degree and calculate the length of their subarrays using the first and last occurrence indices.
5. Keep track of the minimum length of these subarrays and return it as the result.

Time Complexity: O(n) where n is the length of the input array, since we are iterating through the array multiple times.
Space Complexity: O(n) for the HashMaps storing the frequency and indices of the elements.

 */

class Solution {
    public int findShortestSubArray(int[] nums) {
        
        // HashMap<Integer, Integer> freq = new HashMap<>();
        // HashMap<Integer, Integer> first = new HashMap<>();
        // HashMap<Integer, Integer> last = new HashMap<>();

        // // Find frequency, first position and last position
        // for (int i = 0; i < nums.length; i++) {

        //     int x = nums[i];

        //     // frequency
        //     freq.put(x, freq.getOrDefault(x, 0) + 1);

        //     // first occurrence
        //     if (!first.containsKey(x)) {
        //         first.put(x, i);
        //     }

        //     // last occurrence
        //     last.put(x, i);
        // }

        // // Find degree
        // int degree = 0;

        // for (int value : freq.values()) {
        //     degree = Math.max(degree, value);
        // }

        // // Find minimum range among elements having degree
        // int ans = nums.length;

        // for (int x : freq.keySet()) {

        //     if (freq.get(x) == degree) {

        //         int length = last.get(x) - first.get(x) + 1;

        //         ans = Math.min(ans, length);
        //     }
        // }

        // return ans;

        int[] freq = new int[50000];
        int[] first = new int[50000];
        int[] last = new int[50000];

        Arrays.fill(first, -1);

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];

            freq[x]++;

            if (first[x] == -1) {
                first[x] = i;
            }

            last[x] = i;
        }

        int degree = 0;
        for(int f : freq){
            degree = Math.max(degree , f);
        }

        int ans = nums.length;

        for (int x = 0; x < 50000; x++) {
            if (freq[x] == degree) {
                ans = Math.min(ans, last[x] - first[x] + 1);
            }
        }
        return ans;
    }
}