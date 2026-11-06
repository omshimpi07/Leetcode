/*
2248. Intersection of Multiple Arrays

Given a 2D integer array nums where nums[i] is a non-empty array of distinct positive integers, return the list of integers that are present in each array of nums sorted in ascending order.
 
Example 1: Input: nums = [[3,1,2,4,5],[1,2,3,4],[3,4,5,6]] Output: [3,4]
Explanation:The only integers present in each of nums[0] = [3,1,2,4,5], nums[1] = [1,2,3,4], and nums[2] = [3,4,5,6] are 3 and 4, so we return [3,4].

Difficulty : Easy
*/

class Solution {
    public List<Integer> intersection(int[][] nums) {
        

        // int[] freq = new int[1001];

        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = 0; j < nums[i].length; j++) {
        //         freq[nums[i][j]]++;
        //     }
        // }

        // List<Integer> result = new ArrayList<>();

        // for (int i = 1; i <= 1000; i++) {
        //     if (freq[i] == nums.length) {
        //         result.add(i);
        //     }
        // }

        // return result;

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of every number
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {

                map.put(nums[i][j],
                    map.getOrDefault(nums[i][j], 0) + 1);
            }
        }

        List<Integer> result = new ArrayList<>();

        // Find numbers present in every array
        for (int key : map.keySet()) {
            if (map.get(key) == nums.length) {
                result.add(key);
            }
        }

        Collections.sort(result);

        return result;

        // HashSet<Integer> common = new HashSet<>();

        // // Store all elements of the first array
        // for (int x : nums[0]) {
        //     common.add(x);
        // }

        // // Keep only elements present in subsequent arrays
        // for (int i = 1; i < nums.length; i++) {

        //     HashSet<Integer> current = new HashSet<>();

        //     for (int j = 0; j < nums[i].length; j++) {
        //         current.add(nums[i][j]);
        //     }

        //     common.retainAll(current);
        // }

        // List<Integer> result = new ArrayList<>(common);

        // Collections.sort(result);

        // return result;

    }
}