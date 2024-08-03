class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList();
        // Set<Integer> set = new HashSet();
        // for(int i : nums){
        //     if(!set.add(i)) ans.add(i);
        // }

        for(int i : nums){
            i = Math.abs(i);
            nums[i-1] *= -1;

            if(nums[i-1] > 0) ans.add(i);
        }

        return ans;
    }
}