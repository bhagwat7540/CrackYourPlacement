class Solution {
    public String addBinary(String a, String b) {
        String ans = "";
        int carry = 0;

        int i = a.length()-1, j=b.length()-1;
        while(i >= 0 || j>=0){
            int c=0,d=0;
            if(i>=0) c = a.charAt(i) - '0';
            if(j>=0) d = b.charAt(j) - '0';

            int sum = c+d+carry;
            if(sum == 3) {
                ans = '1' + ans;
                carry=1;
            }
            else if(sum == 2){
                ans = '0' + ans;
                carry = 1;
            }
            else if(sum == 1){
                ans = '1'+ans;
                carry=0;
            }
            else{
                ans = '0' + ans;
                carry = 0;
            }
            i--;
            j--;

        }
        if(carry == 1) ans = '1' + ans;
        return ans;
    }
}