class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int curr_row = 0;
        int curr_col = cols - 1;
        while (curr_row < rows && curr_col >= 0) {
            if (matrix[curr_row][curr_col] < target) {
                curr_row++;
            }
            else if (matrix[curr_row][curr_col] > target)
            {
                curr_col--;
            }
            else 
            {
                return true;
            }
        }

        return false;
    }
}
