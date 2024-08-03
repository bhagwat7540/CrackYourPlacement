class Solution {
    public long multiplyTwoLists(Node first, Node second) {
        // Code here
        long mod = (long) 1e9+7;
        long one=0l, two=0l;
        while(first != null){
            one = (one*10 + first.data)%mod;
            first = first.next;
        }
        
        while(second != null){
            two = (two*10 + second.data)%mod;
            second = second.next;
        }
        
        return (one*two)%mod;
        
        
    }
}