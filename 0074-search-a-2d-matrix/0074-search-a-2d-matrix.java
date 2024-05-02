class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int columns = matrix[0].length;
        
        for(int row = 0; row<matrix.length;row++){
            if(target>= matrix[row][0] && target <= matrix[row][columns-1]){
                return binarySearch(matrix, row, target);
            }
        }
        return false;
    }
    
    private boolean binarySearch(int [][] matrix, int row, int target){
        int leftSide = 0;
        int rightSide = matrix[0].length-1;
        for(int i=0; i<matrix[0].length;i++ ){
            
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