/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        flat(head);
        return head;
    }

    private Node flat(Node head){
        Node current = head;
        Node prev = current;

        while(current != null){
            if(current.child != null){
                Node childLast = flat(current.child);
                Node next = current.next;
                childLast.next = next;
                if(next != null) next.prev = childLast;

                current.next = current.child;
                current.child.prev = current;
                current.child = null;

                current = childLast;
            }

            prev = current;
            current = current.next;
        }
        return prev;
    }
}