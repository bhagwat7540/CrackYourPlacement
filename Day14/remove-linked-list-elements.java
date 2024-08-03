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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        ListNode current = head, prev = dummy;
        
        while(current != null){
            if(current.val == val){
                current = current.next;
            }
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