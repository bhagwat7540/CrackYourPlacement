class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        Arrays.sort(nums);
        for(int i=0 ; i<nums.length ; i++){
            int target = 0 - nums[i];
            int j = i+1, k=nums.length-1;

            while(j<k){
                if(nums[i] + nums[j] + nums[k] > 0) k--;
                else if(nums[i] + nums[j] + nums[k] < 0) j++;
                else{
                    List<Integer> list = new ArrayList();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);

                    ans.add(new ArrayList(list));
                    j++;
                    while(j<k && nums[j] == nums[j-1]) j++;
                    
                    k--;
                    while(k>j && nums[k] == nums[k+1]) k--;
                }
            }

            while(i+1<nums.length && nums[i+1] == nums[i]) i++;
        } 

        return ans;
    }
}