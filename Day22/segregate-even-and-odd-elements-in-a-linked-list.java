class Solution {
    Node divide(Node head) {
        // code here
        
        Node last = head;
        Node prev = null;
        while(last.next!=null) last = last.next;
        
        Node current = head;
        Node lastt = last;
        while(current.data%2!=0 && current!=lastt){
            last.next = current;
            current = current.next;
            last.next.next = null;
            last = last.next;
        }
        
        if(current.data % 2 == 0){
            head = current;
            while(current != lastt){
                if(current.data % 2 == 0){
                    prev = current;
                    current = current.next;
                }else{
                    prev.next = current.next;
                    current.next = null;
                    last.next = current;
                    last = current;
                    current = prev.next;
                }
            }
            
            if(last != lastt && lastt.data%2 == 1){
                prev.next = lastt.next;
                last.next = lastt;
                lastt.next = null;
            }
        }
        else{
            last.next = current;
            current.next = null;
        }
        
        
        
        return head;
    }
}