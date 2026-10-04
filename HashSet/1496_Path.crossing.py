"""
1496. Path Crossing

Given a string path, where path[i] = 'N', 'S', 'E' or 'W', each representing moving one unit north, south, east, or west, respectively. You start at the origin (0, 0) on a 2D plane and walk on the path specified by path.
Return true if the path crosses itself at any point, that is, if at any time you are on a location you have previously visited. Return false otherwise.

Example 1: Input: path = "NES" Output: false 
Explanation: Notice that the path doesn't cross any point more than once.

Diificulty : easy

Approach :
1. We can use a set to keep track of the visited positions.
2. We start at the origin (0, 0) and add it to the visited set.
3. We iterate through each character in the path string and update the current position based on the direction.
4. After updating the position, we check if the new position is already in the visited set.
5. If it is, we return True, indicating that the path crosses itself.
6. If we finish iterating through the path without finding any crossings, we return False.

Time complexity of this approach is O(n), where n is the length of the path string, and the space complexity is also O(n) in the worst case, as we may need to store all visited positions in the set.
Space complexity is O(n) because in the worst case, we may need to store all visited positions in the set.

"""

class Solution:
    def isPathCrossing(self, path: str) -> bool:
        x = 0
        y = 0

        visited = set()
        visited.add((0, 0))

        for c in path:

            if c == 'N':
                y += 1

            elif c == 'S':
                y -= 1

            elif c == 'E':
                x += 1

            else:
                x -= 1

            position = (x, y)

            if position in visited:
                return True

            visited.add(position)

        return False