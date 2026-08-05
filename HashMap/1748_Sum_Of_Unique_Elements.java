/*
1748. Sum Of Unique Elements
You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.

Return the sum of all the unique elements of nums.

Example 1: Input: nums = [1,2,3,2] Output: 4
Explanation: The unique elements are [1,3], and the sum is 4.

Difficulty : easy

Approach : HashMap.
1. Create a HashMap to store the frequency of each element in the array.
2. Iterate through the array and populate the HashMap with the count of each element.
3. Initialize a variable to keep track of the sum of unique elements.
4. Iterate through the keys of the HashMap and check if the frequency of each element is 1 (indicating it is unique). If it is unique, add it to the sum.
5. Return the sum of unique elements.

Time Complexity: O(n) where n is the length of the input array.
Space Complexity: O(n) for the HashMap storing the frequency of elements.

*/

class Solution {
    public int sumOfUnique(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length;i++){

            int presum = nums[i];
            map.put(presum,map.getOrDefault(presum,0) + 1);
        }
        int sum = 0;
        for(int unique : map.keySet()){

            if(map.get(unique) == 1){
                sum += unique;
            }
        }
        return sum;

    }
}