class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left<=right){
            int mid = (left + right)/2;
            if(target == nums[mid]){
                return mid;
            }
            // Check if this is left sorted portion
            if(nums[left]<=nums[mid]){
                if (target > nums[mid]){
                    left = mid + 1;
                }
                else if(target < nums[left] ){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }
            // This is for right sorted portion
            else{
                if(target < nums[mid]){
                    right = mid -1;
                }
                else if (target > nums[right]){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
        }
            
        return -1;
    }
}