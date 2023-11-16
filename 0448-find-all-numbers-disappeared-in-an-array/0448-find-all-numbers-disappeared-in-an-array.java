class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int num: nums){
            int i = Math.abs(num) - 1;
            nums[i] = Math.abs(nums[i]) * (-1);
        }
        List<Integer> myList = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i]>0){
                myList.add(i+1);
            }
        }
        return myList ;
    }
}