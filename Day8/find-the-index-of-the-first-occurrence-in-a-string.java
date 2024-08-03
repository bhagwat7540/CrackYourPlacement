class Solution {
    public int strStr(String haystack, String needle) {
        int i=0, j=needle.length();

        while(i <= haystack.length()-needle.length()){
            if(haystack.substring(i,j).equals(needle)) return i;

            i++;
            j++;
        }

        return -1;
    }
}