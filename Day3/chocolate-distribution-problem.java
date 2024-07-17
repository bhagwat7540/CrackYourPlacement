class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        a.sort(null);
        int i=0 , j=m-1;
        int ans = Integer.MAX_VALUE;
        
        while(j<n){
            ans = Math.min(ans, a.get(j)-a.get(i));
            j++;
            i++;
        }
        
        return ans;
    }
}