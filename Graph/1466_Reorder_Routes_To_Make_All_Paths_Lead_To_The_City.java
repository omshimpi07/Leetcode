/*
1466. Reorder Routes to Make All Paths Lead to the City Zero
There are n cities numbered from 0 to n-1 and n-1 roads such that there is only one way to travel between two different cities (this network form a tree). Last year, The ministry of transport decided to orient the roads in one direction because they are too narrow.
Roads are represented by connections where connections[i] = [a, b] represents a road from city a to b. This year, there will be a big event in the capital (city 0), and many people want to travel to this city.
Your task consists of reorienting some roads such that each city can visit the city 0. Return the minimum number of edges changed.

Example 1: Input: n = 6, connections = [[0,1],[1,3],[2,3],[4,0],[4,5]] Output: 3 Explanation: Change the direction of edges show in red such that each node can reach the node 0 (capital). The edges that are not red are not changed. There are three changed edges.
Example 2: Input: n = 5, connections = [[1,0],[1,2],[3,2],[3,4]] Output: 2 Explanation: Change the direction of edges show in red such that each node can reach the node 0 (capital). The edges that are not red are not changed. There are two changed edges.
Example 3: Input: n = 3, connections = [[1,0],[2,0]] Output: 0 Explanation: No edges need to be changed. All paths already lead to the city 0 (capital).

Constraints:
2 <= n <= 5 * 10^4
connections.length == n-1
connections[i].length == 2
0 <= connections[i][0], connections[i][1] <= n-1
connections[i][0] != connections[i][1]

Difficulty : medium
Approach : Depth First Search (DFS).
1. We can represent the cities and roads as a graph. Since the roads are directed, we will store both the original direction and the reverse direction in the graph.
2. We will perform a depth-first search (DFS) starting from city 0. For each neighboring city, we will check if the road is in the original direction (from current city to neighbor) or in the reverse direction (from neighbor to current city).
3. If the road is in the original direction, it means we need to change it to allow travel towards city 0, so we will increment our count of changes.
4. We will continue the DFS for all neighboring cities, marking them as visited to avoid cycles.
5. After the DFS is complete, the count will represent the minimum number of edges that need to be changed to ensure all paths lead to city 0.

Time Complexity: O(n) where n is the number of cities, since we will visit each city and its neighbors once.
Space Complexity: O(n) for the graph representation and the visited array.
*/

class Solution {

    int count = 0;

    public int minReorder(int n, int[][] connections) {

        List<int[]>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : connections) {

            int from = edge[0];
            int to = edge[1];

            graph[from].add(new int[]{to, 1});
            graph[to].add(new int[]{from, 0});
        }

        boolean[] visited = new boolean[n];
        dfs(0, graph, visited);
        return count;
    }

    private void dfs(int city,List<int[]>[] graph,boolean[] visited) {

        visited[city] = true;

        for (int[] neighbor : graph[city]) {

            int nextCity = neighbor[0];
            int needsReverse = neighbor[1];

            if (!visited[nextCity]) {

                count += needsReverse;
                dfs(nextCity, graph, visited);
            }
        }
    }
}