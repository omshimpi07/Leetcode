/*
1926. Nearest Exit from Entrance in Maze
You are given an m x n matrix maze (0-indexed) with empty cells (represented as '.') and walls (represented as '+'). You are also given the entrance of the maze, where entrance = [entrancerow, entrancecol] denotes the row and column of the cell you are initially standing at.
In one step, you can move one cell up, down, left, or right. You cannot step into a cell with a wall, and you cannot step outside the maze. Your goal is to find the nearest exit from the entrance. An exit is defined as an empty cell that is at the border of the maze. The entrance does not count as an exit.
Return the number of steps in the shortest path from the entrance to the nearest exit, or -1 if no such path exists.

Example 1: Input: maze = [["+","+",".","+"],[".",".",".","+"],["+","+","+","+"]], entrance = [1,2] Output: 1 Explanation: There are 3 exits in this maze at (1,0), (0,2), and (2,3). Initially, you are at the entrance cell (1,2). You can reach the nearest exit at (0,2) by moving 1 step up. Example 2: Input: maze = [[".","+"]], entrance = [0,0] Output: -1 Explanation: There are no exits in this maze. Example 3: Input: maze = [[".","+"]], entrance = [0,1] Output: -1 Explanation: There are no exits in this maze. The entrance cell is on the border and is not an exit.

Constraints:
maze.length == m
maze[i].length == n
1 <= m, n <= 100
maze[i][j] is either '.' or '+'.
entrance.length == 2
0 <= entrancerow < m
0 <= entrancecol < n
maze[entrancerow][entrancecol] == '.'

Difficulty : medium

Approach : Breadth First Search (BFS).
1. Use a queue to perform BFS starting from the entrance cell.
2. Mark the entrance cell as visited by changing it to a wall ('+').
3. For each cell dequeued, check if it is an exit (i.e., it is on the border and not the entrance). If it is an exit, return the number of steps taken to reach it.
4. If it is not an exit, enqueue all its valid neighboring cells (up, down, left, right) that are empty ('.') and mark them as visited by changing them to walls ('+').
5. If the queue is exhausted without finding an exit, return -1.

Time Complexity: O(m*n) where m and n are the dimensions of the maze, since in the worst case we may visit all cells.
Space Complexity: O(m*n) for the queue in the worst case when all cells are empty.


*/

class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length, n = maze[0].length;

        Queue<int[]> q = new LinkedList<>();
        q.offer(entrance);

        maze[entrance[0]][entrance[1]] = '+';

        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        int steps = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int[] curr = q.poll();
                int r = curr[0];
                int c = curr[1];

                if (!(r == entrance[0] && c == entrance[1]) &&
                (r == 0 || r == m - 1 || c == 0 || c == n - 1)) {
                    return steps;
                }

                for (int[] d : dirs) { 
                    int nr = r + d[0];
                    int nc = c + d[1];

                    if (nr >= 0 && nr < m && nc >= 0 && nc < n && maze[nr][nc] == '.') {

                        maze[nr][nc] = '+';
                        q.offer(new int[]{nr, nc});
                    }
                }
            }
            steps++;
        }

        return -1;
    }
}