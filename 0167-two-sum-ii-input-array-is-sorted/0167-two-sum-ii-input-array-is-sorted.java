class Solution {
    public int[] twoSum(int[] numbers, int target) {
         int left = 0;
        int right = numbers.length - 1;
        
        for(int i = 0; i<numbers.length;i++){
            if(numbers[left] + numbers[right] > target){
                right--;
            }
            else if(numbers[left] + numbers[right]<target){
                left ++;
            }
            else{
                left++;
                right ++;
                return new int[]{left,right};
            }
        }
        return numbers;
    }
}