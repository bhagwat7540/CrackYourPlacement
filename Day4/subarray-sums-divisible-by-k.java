class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Long , Long> map = new HashMap();
        map.put(0L, 1L);
        Long sum = 0L;
        int ans = 0;

        for(int i : nums){
            sum += i;

            Long modulo = ((sum % k)+k)%k;
            // if(modulo < 0) modulo += k;
            if(map.containsKey(modulo)) ans += map.get(modulo);

            map.put(modulo , map.getOrDefault(modulo , 0L)+1);
        }

        return ans;
    }
}