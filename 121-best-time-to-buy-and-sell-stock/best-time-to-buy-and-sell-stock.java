class Solution {
    public int maxProfit(int[] prices) {
        int minn = Integer.MAX_VALUE;
        int ans = 0;

        for(int i : prices){
            minn = Math.min(i , minn);
            if(i - minn > ans){
                ans = i - minn;
            }
        }

        return ans;
    }
}