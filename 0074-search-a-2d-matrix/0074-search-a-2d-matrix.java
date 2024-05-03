class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int columns = matrix[0].length;
        int left = 0;
        int right = matrix.length - 1;
        for(int row = 0; row<matrix.length;row++){
            while(left<=right){
                int midRow = (left + right)/2;
                if(matrix[midRow][0]<= target && matrix[midRow][columns-1]>=target){
                    return binarySearch(matrix, midRow, target);
                }
                else if(matrix[midRow][0]>target && matrix[midRow][columns-1]>target){
                    right = midRow - 1;
                }else{
                    left = midRow + 1;
                }
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
                    rightSide = mid -1;
                }
                else{
                    leftSide = mid + 1;
                }
            }
        }
        return false;
    }
}