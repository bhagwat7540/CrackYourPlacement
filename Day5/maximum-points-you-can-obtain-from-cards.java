class Solution {
    public int maxScore(int[] cardPoints, int k) {
        long sum = 0l;
        for(int i=0 ; i<k ; i++){
            sum += cardPoints[i];
        }

        long maxx = 1l * sum;

        int i=k-1 , j=cardPoints.length-1;
        while(i>=0){
            sum -= cardPoints[i];
            sum += cardPoints[j];
            maxx = Math.max(sum , maxx);

            i--;
            j--;
        }

        return (int)maxx;
    }
}