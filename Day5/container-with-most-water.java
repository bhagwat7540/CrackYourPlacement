class Solution {
    public int maxArea(int[] height) {
        int i=0 , j=height.length-1;
        int maxArea = Integer.MIN_VALUE;

        while(i<j){
            int minn = Math.min(height[i] , height[j]);
            int width = j-i;

            maxArea = Math.max(maxArea, minn * width);

            if(height[i] > height[j]) j--;
            else i++;
        }

        return maxArea;
    }
}