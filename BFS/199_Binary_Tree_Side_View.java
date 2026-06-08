/*
199. Binary Tree Right Side View
Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

Example 1: Input: root = [1,2,3,null,5,null,4] Output: [1,3,4] Explanation: From the right side, you can see 1, 3, and 4. Example 2: Input: root = [1,null,3] Output: [1,3] Explanation: From the right side, you can see 1 and 3. Example 3: Input: root = [] Output: []

Difficulty : medium

Approach : Breadth First Search (BFS).
1. We can use a breadth-first search (BFS) approach to traverse the binary tree level by level. We will use a queue to keep track of the nodes at each level.
2. For each level, we will iterate through the nodes in the queue and add their children to the queue for the next level. We will also keep track of the last node at each level, which will be the rightmost node that we can see from that level.
3. After processing all levels, we will have a list of the rightmost nodes at each level, which will be the nodes that we can see from the right side of the tree.

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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){

            int size = q.size();

            for(int i = 0; i < size; i++){

                TreeNode curr = q.poll();

                if(i == size - 1){
                    ans.add(curr.val);
                }
        
                if(curr.left != null){
                    q.offer(curr.left);
                }

                if(curr.right != null){
                    q.offer(curr.right);
                }

            }
        }
        return ans;
    }
}