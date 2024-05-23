class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area = 0;
        int result = 0;
        while(left <= right){
            if(result < area){
                result = area;
            }
            if(height[left] <= height[right]){
                area = height[left] * (right - left);
                left ++;
            }
            else{
                area = height[right] * (right - left);
                right --;
            }
        }
        return result;
    }
}