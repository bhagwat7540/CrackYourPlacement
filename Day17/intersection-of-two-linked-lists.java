/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA , b = headB;

        while(a != b){
            a = a.next;
            b = b.next;

            if(a == b) break;

            if(a == null) a = headB;
            if(b == null) b = headA;
        }

        return a;
    }
}