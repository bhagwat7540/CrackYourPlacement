class Solution {
    public int majorityElement(int[] nums) {
        int ans = -1;
        int cnt = 0;

        for(int i : nums){
            if(cnt == 0) ans = i;
            
            if(i == ans) cnt++;
            else cnt--;
        }
        return ans;
    }
}