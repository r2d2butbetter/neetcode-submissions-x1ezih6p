class Solution {
    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            Set<Character> rowSet = new HashSet<>();
            Set<Character> colSet = new HashSet<>();
            Set<Character> sqSet = new HashSet<>();

            for (int j = 0; j < 9; j++) {

                // row
                if (board[i][j] != '.') {
                    if (!rowSet.add(board[i][j])) {
                        return false;
                    }
                }

                // col
                if (board[j][i] != '.') {
                    if (!colSet.add(board[j][i])) {
                        return false;
                    }
                }

                // sq
                int rowIdx = 3 * (i / 3) + j / 3;
                int colIdx = 3 * (i % 3) + j % 3;
                if (board[rowIdx][colIdx] != '.') {
                    if (!sqSet.add(board[rowIdx][colIdx])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
