/*
841. Keys and Rooms
There are n rooms labeled from 0 to n - 1 and all the rooms are locked except for room 0. Your goal is to visit all the rooms. However, you cannot enter a locked room without having its key.
When you visit a room, you may find a set of distinct keys in it. Each key has a number on it, denoting which room it unlocks, and you can take all of them with you to unlock the other rooms.
Given an array rooms where rooms[i] is the set of keys that you can obtain if you visited room i, return true if you can visit all the rooms, or false otherwise.

Example 1:
Input: rooms = [[1],[2],[3],[]]
Output: true
Explanation:
We visit room 0 and pick up key 1.
We then visit room 1 and pick up key 2.
We then visit room 2 and pick up key 3.
We then visit room 3.
Since we were able to visit every room, we return true.

Example 2:
Input: rooms = [[1,3],[3,0,1],[2],[0]]
Output: false
Explanation:
We cannot enter room number 2 since the only key that unlocks it is in that room.
Constraints:

n == rooms.length
2 <= n <= 1000
0 <= rooms[i].length <= 1000
1 <= sum(rooms[i].length) <= 3000
0 <= rooms[i][j] < n
All the values of rooms[i] are unique.

Difficulty : medium
Approach : Depth First Search (DFS).
1. We can use a depth-first search (DFS) approach to explore the rooms and collect keys.
2. We start from room 0, mark it as visited, and recursively visit all the rooms that can be unlocked with the keys found in the current room.
3. We maintain a boolean array to keep track of which rooms have been visited.
4. After the DFS is complete, we check if all rooms have been visited. If any room has not been visited, we return false; otherwise, we return true.

Time Complexity: O(n + m) where n is the number of rooms and m is the total number of keys across all rooms, since we visit each room and each key at most once.
Space Complexity: O(n) for the visited array and the recursion stack in the worst case.
*/

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        dfs(0, rooms, visited);

        for (boolean room : visited) {

            if (room != true) {
                return false;
            }
        }

        return true;
    }

    private void dfs(int room, List<List<Integer>> rooms, boolean[] visited ){

    visited[room] = true;

    for (int key : rooms.get(room)) {

        if (visited[key] != true) {
            dfs(key, rooms, visited);
        }
    }
}
}