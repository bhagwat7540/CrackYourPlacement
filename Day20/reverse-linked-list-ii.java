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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1), res = dummy;
        int i=1;
        ListNode current = head, prevNode = null, afterNode = null;
        while(current != null){
            if(i == left - 1) prevNode = current;
            else if(i >= left && i <= right) {
                res.next = current;
                res = res.next;
            }
            else if(i == right + 1) afterNode = current;

            current = current.next;
            i++;
        }

        res.next = null;
        res = reverse(dummy.next);
        if(prevNode != null) prevNode.next = res;
        if(afterNode != null) getLast(res).next = afterNode;
        if(prevNode == null) return res;
        return head;
    }

    private ListNode reverse(ListNode head){
        ListNode current = head, prev= null;
        while(current != null){
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        return prev;
    }

    private ListNode getLast(ListNode head){

        while(head != null && head.next != null){
            head = head.next;
        }

        return head;
    }
}