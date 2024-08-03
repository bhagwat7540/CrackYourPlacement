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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first = reverse(l1);
        ListNode second = reverse(l2);
        int carry = 0;

        ListNode dummy = new ListNode(-1);
        ListNode result = dummy;

        while(first != null || second != null || carry != 0){
            int val1 = first != null ? first.val : 0;
            int val2 = second != null ? second.val : 0;

            int sum = val1 + val2 + carry;
            if(sum > 9) {
                carry = 1;
                sum -= 10;
            }
            else{
                carry = 0;
            }

            ListNode node = new ListNode(sum);
            result.next = node;
            result = result.next;
            first = first != null ? first.next : null;
            second = second != null ? second.next : null;
        }

        result = reverse(dummy.next);
        return result;
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