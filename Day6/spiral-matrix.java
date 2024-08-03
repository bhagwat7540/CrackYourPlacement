class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList();
        int n = matrix.length, m = matrix[0].length;

        int sr = 0 , er = n-1 , sc = 0 , ec = m-1;

        while(sr <= er && sc <= ec){
            for(int i=sc ; i<=ec ; i++) ans.add(matrix[sr][i]);
            sr++;

            for(int i=sr ; i<=er ; i++) ans.add(matrix[i][ec]);
            ec--;

            if(sr <= er){
                for(int i=ec ; i>=sc ; i--) ans.add(matrix[er][i]);
                er--;
            }
            
            if(sc <= ec){
                for(int i=er ; i>=sr ; i--) ans.add(matrix[i][sc]);
                sc++;
            }
            
        }

        return ans;
    }
}