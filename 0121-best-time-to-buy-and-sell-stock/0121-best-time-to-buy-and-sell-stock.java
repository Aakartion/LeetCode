class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int sell = 0;
        int diff = 0;

        for(int i = 1; i< prices.length ;i++){
            if(buy > prices[i]){
                buy = prices[i];
            }
            if((prices[i] - buy) > diff){
                diff = prices[i] - buy;
            }
        }
        return diff;
    }
}