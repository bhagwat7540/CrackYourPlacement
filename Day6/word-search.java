class Solution {
    int n,m;
    public boolean exist(char[][] board, String word) {
        n = board.length;
        m = board[0].length;
        boolean ans = false;

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                if(board[i][j] == word.charAt(0)) ans = ans || solve(board, word, i , j , 0);
            }
        }
        return ans;

    }

    private boolean solve(char[][] board, String word, int i , int j, int k){

        if(k == word.length()) return true;

        if(i>=n || j>=m || i<0 || j<0 || board[i][j] == '1' || board[i][j] != word.charAt(k)) return false;

        char ch = board[i][j];
        board[i][j] = '1'; 

        boolean ans1 = solve(board, word, i+1, j, k+1);
        boolean ans2 = solve(board, word, i-1, j, k+1);
        boolean ans3 = solve(board, word, i, j+1, k+1);
        boolean ans4 = solve(board, word, i, j-1, k+1);

        board[i][j] = ch;

        return ans1 || ans2 || ans3 || ans4;
    }
}