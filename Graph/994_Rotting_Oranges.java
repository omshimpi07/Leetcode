/*
994. Rotting Oranges

You are given an m x n grid where each cell can have one of three values:
0 representing an empty cell,
1 representing a fresh orange, or
2 representing a rotten orange.
Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.

Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1.

Example 1: Input: grid = [[2,1,1],[1,1,0],[0,1,1]] Output: 4

Example 2: Input: grid = [[2,1,1],[0,1,1],[1,0,1]] Output: -1
Explanation: The orange in the bottom left corner (row 2, column 0) is never rotten, because rotting only happens 4-directionally.

Example 3: Input: grid = [[0,2]] Output: 0
Explanation: Since there are already no fresh oranges at minute 0, the answer is just 0.
 
Constraints:
m == grid.length
n == grid[i].length
1 <= m, n <= 10
grid[i][j] is 0, 1, or 2.

Difficulty : medium

Approach : Breadth First Search (BFS).
1. Use a queue to perform BFS starting from all the rotten oranges (cells with value 2).
2. Count the number of fresh oranges (cells with value 1) at the beginning.
3. For each rotten orange, enqueue its 4-directionally adjacent fresh oranges and mark them as rotten (change their value to 2).
4. Keep track of the number of minutes elapsed during the BFS process.
5. If all fresh oranges become rotten, return the number of minutes elapsed. If there are still fresh oranges left after the BFS, return -1.

Time Complexity: O(m*n) where m and n are the dimensions of the grid, since in the worst case we may visit all cells.
Space Complexity: O(m*n) for the queue in the worst case when all cells are rotten oranges.

*/

class Solution {
    public int orangesRotting(int[][] grid) {
        
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        int m = grid.length;
        int n = grid[0].length;

        for(int i = 0; i < m; i++) {

            for(int j = 0; j < n; j++) {

                if(grid[i][j] == 2) {
                    q.offer(new int[]{i,j});
                }

                if(grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        if(fresh == 0){
            return 0;
        }

        int[][] dirs = { {1,0}, {-1,0}, {0,1}, {0,-1} };

        int minutes = 0;

        while(!q.isEmpty() && fresh > 0) {

            int size = q.size();

            for(int i = 0; i < size; i++) {
                int[] curr = q.poll();
                int r = curr[0];
                int c = curr[1];

                for(int[] d : dirs) {

                    int nr = r + d[0];
                    int nc = c + d[1];

                    if(nr >= 0 && nr < m && nc >= 0 && nc < n && grid[nr][nc] == 1){

                        grid[nr][nc] = 2;
                        fresh--;
                        q.offer(new int[]{nr,nc});
                    }
                }
            }
            minutes++;
            }
        if(fresh == 0){
            return minutes;
        }
        return -1;
            
    
    }
}