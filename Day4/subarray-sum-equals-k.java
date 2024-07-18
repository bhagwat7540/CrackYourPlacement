class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Long, Long> map = new HashMap();
        map.put(0L, 1L);
        long sum = 0L;
        int ans = 0;
        for(int i : nums){
            sum += i;

            if(map.containsKey(sum - k)) ans+=map.get(sum-k);
            
            if(map.containsKey(sum)) map.put(sum, map.get(sum) + 1);
            else map.put(sum , 1L);
        }

        return ans;
    }
}