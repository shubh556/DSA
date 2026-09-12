class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length-1, col = 0;
        while(row >= 0 && col <= matrix[0].length-1){
            int curr = matrix[row][col];
            if(curr == target) return true;
            else if (curr < target) col++;
            else row--;
        }
        return false;
    }
}