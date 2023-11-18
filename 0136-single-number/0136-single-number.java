class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int num: nums){
            // The XOR operator works order dosent matter => 1^1->0, 0^0->0, 1^0->1, 0^1->1
            result = result ^ num;
        }
        return result;
    }
}