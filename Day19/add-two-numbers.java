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
        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while(l1 != null || l2 != null || carry == 1){
            int sum = carry;
            sum += l1 != null ? l1.val : 0;
            sum += l2 != null ? l2.val : 0;

            if(sum > 9) {
                sum -= 10;
                carry = 1;
            }
            else{
                carry = 0;
            }

            current.next = new ListNode(sum);
            current = current.next;

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }

        return dummy.next;
    }
}