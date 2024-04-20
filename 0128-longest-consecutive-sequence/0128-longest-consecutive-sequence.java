class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return 1;
        }
        TreeSet<Integer> treeSet = new TreeSet<>();
        for(int i =0; i<nums.length;i++){
            treeSet.add(nums[i]);
        }
        int counter = 1;
        int maxCount = 1;
        int value = treeSet.first();
        for(int num: treeSet){
            System.out.println(num);
            if(num == value+1){
                value = num;
                counter++;
                if(maxCount < counter){
                    maxCount = counter;
                }
            }
            else{
                counter = 1;
                value = num;
            }
        }
        return maxCount;
    }
}