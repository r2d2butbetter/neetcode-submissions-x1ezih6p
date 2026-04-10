class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i=0; i<9; i++)
        {
            Set<Character> rowset = new HashSet<>();
            Set<Character> colset = new HashSet<>();
            Set<Character> boxset = new HashSet<>();

            for(int j=0; j<9; j++)
            {
                if (board[i][j]!='.')
                {
                    if(!rowset.add(board[i][j])) return false;
                }    



                if (board[j][i]!='.')
                {
                    if(!colset.add(board[j][i])) return false;
                }    


                int rowidx= 3*(i/3) + j/3;
                int colidx= 3*(i%3) + j%3;

                if (board[rowidx][colidx]!='.')
                {
                    if(!boxset.add(board[rowidx][colidx])) return false;
                }    
            }
        }
        return true;
    }
}
