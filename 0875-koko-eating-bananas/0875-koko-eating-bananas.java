class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 0;
        int right = Arrays.stream(piles).max().getAsInt();
        int result = right;
        while(left<=right){
            int mid = (left + right)/2;
            int spentHour = 0;
            for(int pile:piles){
                spentHour = spentHour + (int)Math.ceil((double)pile/mid);
                if(spentHour>h){
                    left = mid + 1;
                    break;
                }
            }
            if(spentHour <= h){
                right = mid - 1;
                result = mid;
            }
            if(result>spentHour && spentHour<=h){
                result = mid;
            }
        }
        
        return result;
}
}
