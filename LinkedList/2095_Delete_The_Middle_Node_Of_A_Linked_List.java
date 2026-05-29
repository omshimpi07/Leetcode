/*
2095. Delete the Middle Node of a Linked List
Given the head of a linked list, delete the middle node, and return the head of the modified linked list.
The middle node of a linked list of size n is the ⌊n / 2⌋th node from the start using 0-based indexing, where ⌊x⌋ denotes the largest integer less than or equal to x.
For n = 1, 2, 3, 4, and 5, the middle nodes are 0, 0, 1, 1, and 2, respectively.
Example 1: Input: head = [1,3,4,7,1,2,6] Output: [1,3,4,1,2,6]
Example 2: Input: head = [1,2,3,4] Output: [1,2,4]
Example 3: Input: head = [2,1] Output: [2]
Difficulty : medium
Approach : Two Pointers.
1. Use two pointers, slow and fast, to traverse the linked list. The slow pointer moves one step at a time, while the fast pointer moves two steps at a time.
2. When the fast pointer reaches the end of the list, the slow pointer will be at the middle node.
3. Keep track of the previous node of the slow pointer so that you can delete the middle node by changing the next pointer of the previous node to skip the middle node.
Time Complexity: O(n) where n is the number of nodes in the linked list, since we need to traverse the list to find the middle node.
Space Complexity: O(1) since we are using only a constant amount of extra space for the pointers.

Approach : Count and Delete.
1. First, traverse the linked list to count the total number of nodes (n).
2. Calculate the index of the middle node using n / 2.
3. Traverse the linked list again to reach the node just before the middle node and change its next pointer to skip the middle node.
Time Complexity: O(n) where n is the number of nodes in the linked list, since we need to traverse the list twice.
Space Complexity: O(1) since we are using only a constant amount of extra space for the pointers.


*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        
            if(head == null || head.next == null){
                return null;
            }
            int n = 0;
            ListNode temp0 = head;

            while(temp0 != null){
                n++;
                temp0 = temp0.next;
            }

            int mid = n / 2;

            ListNode temp2 = head;
            int j = 0;
            while(j < mid -1){
                temp2 = temp2.next;
                j++;
            }
            temp2.next = temp2.next.next;
            
        return head;
    }
}

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        
            if(head == null || head.next == null){
                return null;
            }
            ListNode prev = null;
            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null){
                prev = slow;
                slow = slow.next;
                fast = fast.next.next;
            }
            prev.next = slow.next;
            
        return head;
    }
}
