/*
1496. Path Crossing

Given a string path, where path[i] = 'N', 'S', 'E' or 'W', each representing moving one unit north, south, east, or west, respectively. You start at the origin (0, 0) on a 2D plane and walk on the path specified by path.
Return true if the path crosses itself at any point, that is, if at any time you are on a location you have previously visited. Return false otherwise.

Example 1: Input: path = "NES" Output: false 
Explanation: Notice that the path doesn't cross any point more than once.

Diificulty : easy

Approach : HashSet.
1. Initialize a HashSet to keep track of visited positions, starting with the origin (0, 0).
2. Initialize variables x and y to represent the current position, starting at (0, 0).
3. Iterate through each character in the path string:
   a. Update the x and y coordinates based on the direction (N, S, E, W).
   b. Create a string representation of the current position (e.g., "x,y").
   c. Check if this position is already in the HashSet. If it is, return true (path crosses itself).
   d. If not, add the current position to the HashSet.
4. If the loop completes without finding any crossings, return false.

Time Complexity: O(n) where n is the length of the path string, since we are iterating through the string once and performing O(1) operations for each character.
Space Complexity: O(n) for the HashSet to store visited positions, where n is the number of unique positions visited during the walk.

 */

class Solution {
    public boolean isPathCrossing(String path) {
        

        int x = 0;
        int y = 0;

        HashSet<String> visited = new HashSet<>();

        visited.add("0,0");

        for (char c : path.toCharArray()) {

            if (c == 'N') {
                y++;
            } else if (c == 'S') {
                y--;
            } else if (c == 'E') {
                x++;
            } else {
                x--;
            }

            String position = x + "," + y;

            if (visited.contains(position)) {
                return true;
            }

            visited.add(position);
        }

        return false;

    }
}