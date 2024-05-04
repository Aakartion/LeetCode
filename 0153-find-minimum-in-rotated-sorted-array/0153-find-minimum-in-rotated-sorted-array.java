class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int min = 5000;
        while(left<=right){
            int mid = (left + right)/2;
            if(nums[left]>nums[right] && nums[left]>nums[mid]){
                right = mid - 1;
                if(nums[mid]<min){
                    min = nums[mid];
                }
            }
            else {
                System.out.println("Mid: " + nums[mid]);
                System.out.println("Nums[left]: " + nums[left]);
                
                if(nums[left]<nums[mid] && nums[mid]<min){
                    min = nums[left];
                }
                if(nums[mid]<min){
                    min = nums[mid];
                }
                left = mid + 1;
            }
        }
        return min;
    }
}