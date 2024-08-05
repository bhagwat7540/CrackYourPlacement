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
    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }

    private ListNode mergeSort(ListNode head){
        if(head == null || head.next == null) return head;

        ListNode mid = getMid(head);
        ListNode rightNode = mid.next;
        mid.next = null;
        head = mergeSort(head);
        rightNode = mergeSort(rightNode);
        return merge(head, rightNode);
    }

    private ListNode merge(ListNode head1, ListNode head2){
        ListNode dummy = new ListNode(-1), prev = dummy;
        while(head1!=null && head2!=null){
            if(head1.val <= head2.val) {
                prev.next = head1;
                head1 = head1.next;
            }
            else{
                prev.next = head2;
                head2 = head2.next;
            }

            prev = prev.next;
        }

        while(head1 != null){
            prev.next = head1;
            prev = prev.next;
            head1 = head1.next;
        }

        while(head2 != null){
            prev.next = head2;
            prev = prev.next;
            head2 = head2.next;
        }

        prev.next = null;
        return dummy.next;
    }

    private ListNode getMid(ListNode head){
        ListNode slow = head, fast = head.next;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}