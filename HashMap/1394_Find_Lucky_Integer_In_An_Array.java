/*
1394. Find Lucky Integer in an Array
Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.
Return a lucky integer in the array. If there are multiple lucky integers return the largest of them. If there is no lucky integer return -1.

Example 1: Input: arr = [2,2,3,4] Output: 2 Explanation: The only lucky number in the array is 2 because frequency[2] == 2.
Example 2: Input: arr = [1,1,1,3] Output: -1 Explanation: There are no lucky numbers in the array.
Example 3: Input: arr = [1,1,1,3,3] Output: 3 Explanation: The lucky numbers in the array are 1 and 3. 1 has a frequency of 3 and 3 has a frequency of 2. The largest lucky number in the array is 3.

Constraints: 1 <= arr.length <= 500 1 <= arr[i] <= 500

Difficulty : easy

Approach:
1. Use a HashMap to count the frequency of each integer in the array.
2. Iterate through the HashMap entries to find integers whose frequency matches their value.
3. Keep track of the maximum lucky integer found.
Time Complexity: O(n) where n is the length of the input array.
Space Complexity: O(n) for the HashMap storing the frequency counts.

*/

class Solution {
    public int findLucky(int[] arr) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i <arr.length;i++){
            int presum = arr[i];
            map.put(presum,map.getOrDefault(presum,0)+1);
        }
        
        int maxLucky = -1;

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            int num = e.getKey();
            int freq = e.getValue();

            if (num == freq) {
                maxLucky = Math.max(maxLucky, num);
            }
        }
        return maxLucky;
    }
}