/*
1365. How Many Numbers Are Smaller Than the Current Number
Given the array nums, for each nums[i] find out how many numbers in the array are
smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

Example 1: Input: nums = [8,1,2,2,3] output: [4,0,1,1,3]
Explanation: For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).

Difficulty : Easy

Approach : HashMap.
1. Create a HashMap to store the frequency of each number in the input array.
2. Iterate through the input array and populate the HashMap with the frequency of each number.
3. Create an output array of the same length as the input array to store the result.
4. For each number in the input array, iterate through all possible smaller values (from 0 to nums[i]-1) and sum their frequencies from the HashMap to get the count of smaller numbers.

Time Complexity: O(n + m) where n is the length of the input array and m is the range of numbers in the input array (0 to 100).
Space Complexity: O(m) for the HashMap, where m is the range of numbers in the input array (0 to 100).

*/

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        
        // int output[] = new int[nums.length];
        // for(int i = 0; i < nums.length ; i++){
        //     int count = 0;
        //     for(int j = 0; j< nums.length  ; j++){

        //         if( nums[i] > nums[j]){
        //             count++;
        //         }
        //     }
        //     output[i] = count;
            
        // }
        // return output;

        HashMap<Integer, Integer> map = new HashMap<>();

        // Store frequency of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] output = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            int count = 0;

            // Check every possible smaller value
            for (int j = 0; j < nums[i]; j++) {
                count += map.getOrDefault(j, 0);
            }

            output[i] = count;
        }

        return output;
    }
}