class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowStart = 0, rowEnd = matrix.length-1;
        int colStart = 0, colEnd = matrix[0].length-1;
        int targetRow = -1;

        while(rowStart <= rowEnd){
            int rowMid = rowStart + (rowEnd - rowStart)/2;
            if(target >= matrix[rowMid][0] && target <= matrix[rowMid][matrix[0].length - 1]){
                targetRow = rowMid;
                break;
            }
            else if(target < matrix[rowMid][0]){
                rowEnd = rowMid - 1;
            }
            else{
                rowStart = rowMid + 1;
            }
        }

        if (targetRow == -1) return false;

        while(colStart <= colEnd){
            int mid = colStart + (colEnd - colStart)/2;
            if(matrix[targetRow][mid] == target) return true;
            else if (matrix[targetRow][mid] < target) colStart = mid + 1;
            else colEnd = mid - 1;
        }
        return false;
    }
}