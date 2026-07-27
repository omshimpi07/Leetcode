/*
645. Set Mismatch

You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.
You are given an integer array nums representing the data status of this set after the error.
Find the number that occurs twice and the number that is missing and return them in the form of an array.

Example 1:Input: nums = [1,2,2,4] Output: [2,3]
Example 2: Input: nums = [1,1] Output: [1,2]

Difficulty : easy

Approach : HashMap.
1. Create a HashMap to store the frequency of each number in the input array.   
2. Iterate through the input array and populate the HashMap with the count of each number.
3. Initialize two variables, duplicate and missing, to store the duplicate and missing numbers respectively.    
4. Iterate through the numbers from 1 to n (where n is the length of the input array):
   a. If a number is not present in the HashMap, it is the missing number.  
   b. If a number has a count of 2 in the HashMap, it is the duplicate number.  
5. Return an array containing the duplicate and missing numbers.

Time Complexity: O(n) where n is the length of the input array, since we are iterating through the array and the range of numbers from 1 to n.
Space Complexity: O(n) for the HashMap storing the frequency of numbers.

*/

class Solution {

    public int[] findErrorNums(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int duplicate = 0;
        int missing = 0;

        for (int i = 1; i <= nums.length; i++) {

            if (!map.containsKey(i)) {
                missing = i;
            }
            else if (map.get(i) == 2) {
                duplicate = i;
            }
        }

        return new int[]{duplicate, missing};
    }
}