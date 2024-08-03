/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node temp = head;

        while(temp != null){
            Node copy = new Node(temp.val);
            Node nextNode = temp.next;
            temp.next = copy;
            copy.next = nextNode;
            temp = temp.next.next;
        }

        temp = head;
        while(temp != null && temp.next != null){
            Node randomNode = temp.random;
            temp.next.random = randomNode != null ? randomNode.next : null;
            temp = temp.next.next;
        }

        temp = head;
        Node dummy = new Node(-1);
        Node current = dummy;
        while(temp != null && temp.next != null){
            Node required = temp.next;
            current.next = required;
            temp.next = temp.next.next;
            temp = temp.next;
            current = current.next;
        }

        current.next = null;
        return dummy.next;
    }
}