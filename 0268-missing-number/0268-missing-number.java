class Solution {
    public int missingNumber(int[] nums) {
        int inputSum = 0;
        int expectedSum = 0;
        for(int i = 0; i <nums.length; i++){
            inputSum = nums[i]+ inputSum;
            expectedSum = expectedSum + i+1;
        }
        return (expectedSum - inputSum);
    }
}