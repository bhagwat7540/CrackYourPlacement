class Solution
{
    Node compute(Node head)
    {
        // your code here
        
        Node rev = reverse(head);
        
        Node dummy = new Node(-1);
        Node curr = dummy;
        while(rev != null){
            if(rev.data >= curr.data){
                curr.next = rev;
                curr = curr.next;
            }
            
            rev = rev.next;
        }
        
        curr.next = null;
        Node ans = reverse(dummy.next);
        return ans;
    }
    
    Node reverse(Node head){
        Node curr = head, prev = null;
        while(curr != null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        return prev;
    }
}