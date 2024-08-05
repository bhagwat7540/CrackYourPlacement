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
    public ListNode partition(ListNode head, int x) {
        ListNode dummyLess = new ListNode(-1);
        ListNode dummyMore = new ListNode(-1);
        ListNode d1 = dummyLess, d2 = dummyMore;

        while(head != null){
            if(head.val < x) {
                d1.next = head;
                d1 = d1.next;
            }
            else {
                d2.next = head;
                d2 = d2.next;
            }

            head = head.next;
        }

        d1.next = null;
        d2.next = null;

        d1.next = dummyMore.next;
        return dummyLess.next;
    }
}