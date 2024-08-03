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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-101);
        ListNode current = head, prev = dummy;

        while(current != null){
            if(prev.val == current.val) current = current.next;
            else{
                prev.next = current;
                current = current.next;
                prev = prev.next;
            }
        }

        prev.next = null;
        return dummy.next;

    }
}