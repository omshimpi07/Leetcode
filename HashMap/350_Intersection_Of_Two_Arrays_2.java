/*
350. Intersection of Two Arrays II

Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

Example 1: Input: nums1 = [1,2,2,1], nums2 = [2,2] Output: [2,2]

Example 2: Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4] Output: [4,9]
Explanation: [9,4] is also accepted.
 
Difficulty : Easy
*/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        // ArrayList<Integer> list1 = new ArrayList<>();

        // for(int i = 0; i< nums1.length; i++){

        //     for(int j = 0; j< nums2.length ; j++){

        //         if(nums1[i] == nums2[j] ){

        //             list1.add(nums1[i]);
                    
        //             nums2[j] = -1;
        //             break;
        //         }
        //     }

        // }

        // return list1.stream().mapToInt(i -> i).toArray();

        ArrayList<Integer> list1 = new ArrayList<>();

        HashMap<Integer , Integer> map1 = new HashMap<>();

        for(int i = 0; i < nums2.length; i++ ){

            int presum = nums2[i];

            map1.put(presum , map1.getOrDefault(presum , 0) + 1);
        }

        for (int i = 0; i < nums1.length; i++) {

            int num = nums1[i];

            if (map1.getOrDefault(num, 0) > 0) {

                list1.add(num);

                map1.put(num, map1.get(num) - 1);
            }
        }

        return list1.stream().mapToInt(i -> i).toArray();

    }
}