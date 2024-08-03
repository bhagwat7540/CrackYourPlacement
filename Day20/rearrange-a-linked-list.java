class Solution {

    // Should rearrange given linked list such that all even
    // positioned Nodes are before odd positioned.
    // Returns nothing
    void rearrangeEvenOdd(Node head) {
        //  The task is to complete this method
        Node dummyEven = new Node(-1), d1 = dummyEven;
        Node dummyOdd = new Node(-1), d2 = dummyOdd;
        
        while(head != null){
            d2.next = head;
            head = head.next;
            d2 = d2.next;
            
            if(head != null){
                d1.next = head;
                head = head.next;
                d1 = d1.next;
            }
        }
        d1.next = null;
        d2.next = dummyEven.next;
        head = dummyOdd.next;
    }
}