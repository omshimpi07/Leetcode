/*
1161. Maximum Level Sum of a Binary Tree
Given the root of a binary tree, the level of its root is 1, the level of its children is 2, and so on.
Return the smallest level x such that the sum of all the values of nodes at level x is maximal.

Example 1: Input: root = [1,7,0,7,-8] Output: 2 Explanation: Level 1 sum = 1. Level 2 sum = 7 + 0 = 7. Level 3 sum = 7 + -8 = -1. So we return the level with the maximum sum which is level 2. Example 2: Input: root = [989,null,10250,98693,-89388,null,null,null,null,null,null,null,null] Output: 2
Explanation: The level sums are: - Level 1 sum = 989. - Level 2 sum = 10250. - Level 3 sum = 98693 + -89388 = 92905. So we return the level with the maximum sum which is level 2.

Difficulty : medium

Approach : Breadth First Search (BFS).
1. We can use a breadth-first search (BFS) approach to traverse the binary tree level by level. We will use a queue to keep track of the nodes at each level.
2. For each level, we will iterate through the nodes in the queue and calculate the sum of their values. We will also add their children to the queue for the next level.
3. We will keep track of the maximum sum encountered and the corresponding level. After processing all levels, we will return the level that has the maximum sum.

Time Complexity: O(n) where n is the number of nodes in the binary tree, since we visit each node once.
Space Complexity: O(w) where w is the maximum width of the binary tree, which is the maximum number of nodes at any level. In the worst case (a complete binary tree), this can be O(n/2) = O(n).

*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxLevelSum(TreeNode root) {

        if(root == null){
            return 0;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int maxSum = Integer.MIN_VALUE;
        int answerLevel = 1;
        int level = 1;

        while(!q.isEmpty()){

        int size = q.size();
        int sum = 0;

            for(int i = 0; i < size; i++){

                TreeNode curr = q.poll();
                sum += curr.val;

                if(curr.left != null){
                    q.offer(curr.left);
                }
                if(curr.right != null){
                    q.offer(curr.right);
                }

            }
            if(sum > maxSum){
                maxSum = sum;
                answerLevel = level;
            }
            level++;
        }
        return answerLevel;
    }
}