class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        for(int num:nums){
            if(mySet.contains(num)){
                return true;
            }
            else{
                mySet.add(num);
            }
        }
        return false;
    }
}