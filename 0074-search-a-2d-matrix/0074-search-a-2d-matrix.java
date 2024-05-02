class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        boolean result = false;
        
        for(int row = 0; row<rows;row++){
            if(target>= matrix[row][0] && target <= matrix[row][columns-1]){
                result = binarySearch(matrix, row, target);
            }
        }
        return result;
    }
    
    private boolean binarySearch(int [][] matrix, int row, int target){
        int leftSide = 0;
        int columnLength = matrix[0].length;
        int rightSide = columnLength-1;
        for(int i=0; i<columnLength;i++ ){
            
            while(leftSide<=rightSide){
                int mid = (leftSide + rightSide)/2;
                if(matrix[row][mid] == target){
                    return true;
                }
                else if(matrix[row][mid] > target){
                    rightSide --;
                }
                else{
                    leftSide++;
                }
            }
        
        }
        return false;
    }
}