/*
1313. Decompress Run-Length Encoded List

We are given a list nums of integers representing a list compressed with run-length encoding.
Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).  For each such pair, there are freq elements with value val concatenated in a sublist. Concatenate all the sublists from left to right to generate the decompressed list.
Return the decompressed list.

Example 1: Input: nums = [1,2,3,4] Output: [2,4,4,4]
Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
At the end the concatenation [2] + [4,4,4] is [2,4,4,4].

Diifficulty : easy

Approach : Array.
1. Initialize a variable size to 0 to keep track of the total size of the decompressed list.
2. Iterate through the nums array in steps of 2 (i.e., for each pair
    [freq, val]), and add the freq value to size.
3. Create an integer array ans of size size to hold the decompressed list.
4. Initialize an index variable to 0 to keep track of the current position in the ans array.
5. Iterate through the nums array again in steps of 2, and for each pair [freq, val], fill the ans array with freq occurrences of val starting from the current index.
6. After filling the ans array, return it as the result.

Time Complexity: O(n) where n is the length of the nums array, since we iterate through it twice.
Space Complexity: O(m) where m is the total number of elements in the decompressed list, which is equal to the sum of all freq values in the nums array.

*/

class Solution {
    public int[] decompressRLElist(int[] nums) {

        // ArrayList<Integer> list = new ArrayList<>();

        // for(int i = 0; i < nums.length; i += 2){

        //     int freq = nums[i];
        //     int val = nums[i + 1];

        //     while(freq > 0){
        //         list.add(val);
        //         freq--;
        //     }
        // }

        // int[] ans = new int[list.size()];

        // for(int i = 0; i < list.size(); i++){
        //     ans[i] = list.get(i);
        // }

        // return ans;

        int size = 0;

        for(int i = 0; i < nums.length; i += 2){
            size += nums[i];
        }

        int[] ans = new int[size];

        int index = 0;

        for(int i = 0; i < nums.length; i += 2){

            int freq = nums[i];
            int val = nums[i + 1];

            while(freq > 0){
                ans[index] = val;
                index++;
                freq--;
            }
        }

        return ans;
        
    }
}