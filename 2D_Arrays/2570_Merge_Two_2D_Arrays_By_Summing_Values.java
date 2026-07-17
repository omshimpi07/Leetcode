/*
2570. Merge Two 2D Arrays by Summing Values

You are given two 2D integer arrays nums1 and nums2.
nums1[i] = [idi, vali] indicate that the number with the id idi has a value equal to vali.
nums2[i] = [idi, vali] indicate that the number with the id idi has a value equal to vali.
Each array contains unique ids and is sorted in ascending order by id.

Merge the two arrays into one array that is sorted in ascending order by id, respecting the following conditions:
Only ids that appear in at least one of the two arrays should be included in the resulting array.
Each id should be included only once and its value should be the sum of the values of this id in the two arrays. If the id does not exist in one of the two arrays, then assume its value in that array to be 0.
Return the resulting array. The returned array must be sorted in ascending order by id.

Example 1: Input: nums1 = [[1,2],[2,3],[4,5]], nums2 = [[1,4],[3,2],[4,1]]
Output: [[1,6],[2,3],[3,2],[4,6]]
Explanation: The resulting array contains the following:
- id = 1, the value of this id is 2 + 4 = 6.
- id = 2, the value of this id is 3.
- id = 3, the value of this id is 2.
- id = 4, the value of this id is 5 + 1 = 6.

Example 2: Input: nums1 = [[2,4],[3,6],[5,5]], nums2 = [[1,3],[4,3]]
Output: [[1,3],[2,4],[3,6],[4,3],[5,5]]
Explanation: There are no common ids, so we just include each id with its value in the resulting list.
 

Constraints:
1 <= nums1.length, nums2.length <= 200
nums1[i].length == nums2[j].length == 2
1 <= idi, vali <= 1000
Both arrays contain unique ids.
Both arrays are in strictly ascending order by id.

Difficulty : easy

Approach : Two Pointers.
1. Initialize two pointers i and j to 0, which will be used to traverse nums1 and nums2 respectively.
2. Create an empty list ans to store the merged results.
3. While both pointers are within the bounds of their respective arrays:
   a. If the ids at nums1[i] and nums2[j] are equal, sum their values and add [id, sum] to ans. Increment both i and j.
   b. If the id at nums1[i] is less than the id at nums2[j], add nums1[i] to ans and increment i.
   c. If the id at nums1[i] is greater than the id at nums2[j], add nums2[j] to ans and increment j.    
4. After the loop, if there are remaining elements in nums1, add them to ans.
5. If there are remaining elements in nums2, add them to ans.

Time Complexity: O(n + m) where n is the length of nums1 and m is the length of nums2, since we are traversing both arrays once.
Space Complexity: O(n + m) for the resulting array ans, which can contain at most n + m elements in the worst case where there are no common ids between nums1 and nums2. 

*/

class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {

        List<int[]> ans = new ArrayList<>();

        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i][0] == nums2[j][0]) {

                ans.add(new int[]{
                    nums1[i][0],
                    nums1[i][1] + nums2[j][1]
                });

                i++;
                j++;

            } else if (nums1[i][0] < nums2[j][0]) {

                ans.add(new int[]{
                    nums1[i][0],
                    nums1[i][1]
                });

                i++;

            } else {

                ans.add(new int[]{
                    nums2[j][0],
                    nums2[j][1]
                });

                j++;
            }
        }

        while (i < nums1.length) {
            ans.add(new int[]{
                nums1[i][0],
                nums1[i][1]
            });
            i++;
        }

        while (j < nums2.length) {
            ans.add(new int[]{
                nums2[j][0],
                nums2[j][1]
            });
            j++;
        }

        int[][] result = new int[ans.size()][2];

        for (int k = 0; k < ans.size(); k++) {
            result[k] = ans.get(k);
        }

        return result;
    }
}