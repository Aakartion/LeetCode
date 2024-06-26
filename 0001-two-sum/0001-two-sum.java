class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(!hashMap.containsKey(target-nums[i])){
                hashMap.put(nums[i], i);
            }
            else{
                return new int []{hashMap.get(target-nums[i]),i};
            }
        }
        return new int[]{};
    }
}