/*
1893. Check if All the Integers in a Range Are Covered

You are given a 2D integer array ranges and two integers left and right. Each ranges[i] = [starti, endi] represents an inclusive interval between starti and endi.
Return true if each integer in the inclusive range [left, right] is covered by at least one interval in ranges. Return false otherwise.
An integer x is covered by an interval ranges[i] = [starti, endi] if starti <= x <= endi.

Example 1: Input: ranges = [[1,2],[3,4],[5,6]], left = 2, right = 5 Output: true
Explanation: Every integer between 2 and 5 is covered:
- 2 is covered by the first range.
- 3 and 4 are covered by the second range.
- 5 is covered by the third range.

Difficulty : Easy
*/

class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        
        // Arrays.sort(ranges, (a, b) -> Integer.compare(a[0], b[0]));

        // for (int i = 0; i < ranges.length; i++) {

        //     while (left >= ranges[i][0] &&
        //            left <= ranges[i][1]) {

        //         left++;

        //         if (left > right) {
        //             return true;
        //         }
        //     }
        // }

        // return false;

        // HashSet<Integer> set = new HashSet<>();

        // for (int i = 0; i < ranges.length; i++) {

        //     for (int j = ranges[i][0]; j <= ranges[i][1]; j++) {

        //         set.add(j);
        //     }
        // }

        // for (int i = left; i <= right; i++) {

        //     if (!set.contains(i)) {
        //         return false;
        //     }
        // }

        // return true;

        // boolean[] visited = new boolean[51];

        // for (int i = 0; i < ranges.length; i++) {

        //     int start = ranges[i][0];
        //     int end = ranges[i][1];

        //     for (int j = start; j <= end; j++) {
        //         visited[j] = true;
        //     }
        // }

        // for (int i = left; i <= right; i++) {

        //     if (!visited[i]) {
        //         return false;
        //     }
        // }

        // return true;

        int[] diff = new int[52];

        int sum = 0;

        for(int i = 0 ; i< ranges.length ; i++){
            
            int start = ranges[i][0];
            int end = ranges[i][1];

            diff[start]++;
            diff[end + 1]--;

        }
        
        for (int i = 0; i <= right; i++) {
            sum += diff[i];

            if (i >= left && sum == 0) {
                return false;
            }
        }   
        return true;

    }
}