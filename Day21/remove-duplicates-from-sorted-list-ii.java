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
        ListNode dummy = new ListNode(-500);
        ListNode prev = dummy, current = head;

        while(current != null){
            ListNode next = current.next;
            if(next != null && current.val == next.val) {
                while(current != null && current.val == next.val)
                    current = current.next;
            }
            else{
                prev.next = current;
                prev = prev.next;
                current = current.next;
            }
        }
        prev.next = null;
        return dummy.next;
    }
}