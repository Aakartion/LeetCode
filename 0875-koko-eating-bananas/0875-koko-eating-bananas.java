class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 0;
        int right = Arrays.stream(piles).max().getAsInt();
        int result = right;
        while(left<=right){
            int mid = (left + right)/2;
            int tempCounter = 0;
            for(int pile:piles){
                tempCounter = tempCounter + (int)Math.ceil((double)pile/mid);
                if(tempCounter>h){
                    left = mid + 1;
                    break;
                }
            }
            if(tempCounter <= h){
                right = mid - 1;
                result = mid;
            }
            if(result>tempCounter && tempCounter<=h){
                result = mid;
            }
        }
        
        return result;
}
}
