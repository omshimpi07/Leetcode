/*
547. Number of Provinces
There are n cities. Some of them are connected, while some are not. If city a is connected directly with city b, and city b is connected directly with city c, then city a is connected indirectly with city c.
A province is a group of directly or indirectly connected cities and no other cities outside of the group. You are given an n x n matrix isConnected where isConnected[i][j] = 1 if the ith city and the jth city are directly connected, and isConnected[i][j] = 0 otherwise.
Return the total number of provinces.

Example 1: Input: isConnected = [[1,1,0],[1,1,0],[0,0,1]] Output: 2
Explanation: There are 2 provinces: {0, 1} and {2}.

Example 2: Input: isConnected = [[1,0,0],[0,1,0],[0,0,1]] Output: 3
Explanation: There are 3 provinces: {0}, {1}, and {2}.

Constraints:
n == isConnected.length
n == isConnected[i].length
2 <= n <= 200
1 <= isConnected[i][j] <= 1
isConnected[i][i] == 1
isConnected[i][j] == isConnected[j][i]

Difficulty : medium

Approach : Depth First Search (DFS).
1. We can use a depth-first search (DFS) approach to explore the cities and find connected components (provinces).
2. We start from each unvisited city, mark it as visited, and recursively visit all the cities that are directly connected to it.
3. Each time we start a new DFS from an unvisited city, it indicates the discovery of a new province, so we increment the province count.
4. After the DFS is complete for all cities, we return the total count of provinces.
Time Complexity: O(n^2) where n is the number of cities, since we may need to check each city against every other city in the worst case.
Space Complexity: O(n) for the visited array and the recursion stack in the worst case.

*/

class Solution {
    public int findCircleNum(int[][] isConnected) {
        
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int provinces = 0;

        for(int city = 0; city < n; city++){

            if(visited[city] != true){

                dfs(city, isConnected, visited);
                provinces++;
            }
        }
        return provinces;

    }
    private void dfs(int city, int[][] isConnected, boolean[] visited){

        visited[city] = true;

        for(int neighbor = 0; neighbor < isConnected.length; neighbor++){

            if( isConnected[city][neighbor] == 1 && visited[neighbor] != true){

                dfs(neighbor,isConnected,visited);
            }
        }
    }
}