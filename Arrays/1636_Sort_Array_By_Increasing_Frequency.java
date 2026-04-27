/*
1636. Sort Array by Increasing Frequency
Given an array of integers nums, sort the array in increasing order based on the frequency of the
values. If multiple values have the same frequency, sort them in decreasing order. Return the sorted array.

Example 1: Input: nums = [1,1,2,2,2,3] Output: [3,1,1,2,2,2] Explanation: '3' has a frequency of 1, '1' has a frequency of 2 and '2' has a frequency of 3.
Example 2: Input: nums = [2,3,1,3,2]
Output: [1,3,3,2,2] Explanation: '2' has a frequency of 2, '3' has a frequency of 2 and '1' has a frequency of 1. Note that '3' comes before '2' because '3' is larger than '2'.
Example 3: Input: nums = [-1,1,-6,4,5,-6,1,4,1] Output: [5,-1,4,4,-6,-6,1,1,1] Explanation: '5' and '-1' have a frequency of 1, '4' has a frequency of 2, '-6' has a frequency of 2 and '1' has a frequency of 3. Note that '5' comes before '-1' because '5' is larger than '-1' and '-6' comes before '1' because '-6' is smaller than '1'.       
Constraints: 1 <= nums.length <= 100,  -100 <= nums[i] <= 100

Difficulty : medium
Approach:
1. Use a HashMap to count the frequency of each integer in the input array.
2. Convert the input array to an Integer array to use with a custom comparator for sorting.
3. Sort the Integer array using a custom comparator that sorts based on frequency (ascending) and then by value (descending) when frequencies are equal.
4. Convert the sorted Integer array back to an int array and return it.
Time Complexity: O(n log n) due to the sorting step, where n is the length of the input array.


*/

import java.util.*;

class Solution {
    public int[] frequencySort(int[] nums) {

        // Step 1: Frequency map
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Convert to Integer[]
        Integer[] arr = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }

        // Step 3: Sort using rules
        Arrays.sort(arr, (a, b) -> {
            int freqA = map.get(a);
            int freqB = map.get(b);

            if (freqA == freqB) {
                return b - a; // value descending
            }
            return freqA - freqB; // freq ascending
        });

        // Step 4: Convert back
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        return result;
    }
}    

