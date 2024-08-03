class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList();
        Arrays.sort(nums);

        for(int i=0 ; i<n-3 ; i++){
            Long sum = 1L*nums[i];

            for(int j=i+1 ; j<n-2 ; j++){ 

                int s=j+1 , e=n-1;
                while(s < e){
                    if(sum + nums[j] + nums[s] + nums[e] > target) e--;
                    else if(sum + nums[j] + nums[s] + nums[e] < target) s++;
                    else{
                        List<Integer> quad = new ArrayList();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[s]);
                        quad.add(nums[e]);
                        ans.add(quad);

                        s++;
                        e--;
                        while(s<e && nums[s] == nums[s-1]) s++;
                        while(e>s && nums[e] == nums[e+1]) e--;
                    }
                }

                while(j+1 < n-2 && nums[j] == nums[j+1]) j++;
            }

            while(i+1 < n-3 && nums[i] == nums[i+1])i++;
        }

        return ans;
    }
}