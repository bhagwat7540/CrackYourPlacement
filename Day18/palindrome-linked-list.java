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
    public boolean isPalindrome(ListNode head) {
        
        ListNode mid = getMid(head);
        ListNode first = mid.next;
        mid.next = null;
        ListNode rev = reverse(first);

        while(rev != null){
            if(rev.val != head.val) return false;
            rev = rev.next;
            head = head.next;
        }

        return true;
    }

    private ListNode getMid(ListNode head){
        ListNode slow = head, fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private ListNode reverse(ListNode head){
        ListNode curr = head, prev = null;

        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}