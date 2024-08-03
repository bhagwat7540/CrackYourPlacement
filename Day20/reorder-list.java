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
    public void reorderList(ListNode head) {
        ListNode slow = head, fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode nextToMid = slow.next;
        slow.next = null;

        ListNode rev = reverse(nextToMid);
        ListNode current = head;
        while(current != null){
            ListNode temp = current.next;
            ListNode tempRev = rev != null ? rev.next : null;
            current.next = rev;
            if(rev != null) rev.next = temp;
            current = temp;
            rev = tempRev;
        }
    }

    private ListNode reverse(ListNode head){
        ListNode current = head, prev = null;

        while(current != null){
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        return prev;
    }
}