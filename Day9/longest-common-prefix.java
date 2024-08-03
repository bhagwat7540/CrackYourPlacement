class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0], last = strs[strs.length-1];
        int i=0;
        String ans = new String("");

        while(i < Math.min(first.length(), last.length())){

            if(first.charAt(i) == last.charAt(i)) ans += first.charAt(i);
            else break;

            i++;
        }

        return ans;
    }
}