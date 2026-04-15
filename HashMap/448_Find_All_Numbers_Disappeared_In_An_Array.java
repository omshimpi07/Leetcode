/*
448. Find All Numbers Disappeared in an Array
Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.Find all the elements of [1, n] inclusive that do not appear in this array.

Example: Input: [4,3,2,7,8,2,3,1] Output: [5,6]
Note: You can do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

Difficulty : easy

Approach:
1. Use a HashMap to count the frequency of each number in the input array.
2. Iterate through the numbers from 1 to n and check if each number is present in the HashMap.
3. If a number is not present in the HashMap, it means it is missing from the input array, so add it to the result list.

Time Complexity: O(n) where n is the length of the input array.
Space Complexity: O(n) for the HashMap and the result list.

*/
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        HashMap<Integer , Integer> map = new HashMap<>();
        int freq = 0;
        for(int i = 0; i<nums.length;i++){

            int presum = nums[i];
            freq = map.getOrDefault(presum,0)+1;
            map.put(presum,freq );
        }
        List<Integer> List1 = new ArrayList<>();
        for(int i = 1; i<=nums.length;i++){
            if(!map.containsKey(i)){
                List1.add(i);
            }
        }
        return List1;
    }
}