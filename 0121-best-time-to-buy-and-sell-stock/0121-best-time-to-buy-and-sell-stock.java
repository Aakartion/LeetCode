class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int sell = prices[0];
        int profit = 0;
        for(int i=0; i<prices.length;i++){
            int currentProfit = sell - buy;
            if(prices[i]<buy){
                buy = prices[i];
                sell = buy;
            }
            if(prices[i]>sell){
                sell = prices[i];
                currentProfit = sell - buy;
            }
            if(currentProfit >= profit){
                profit = currentProfit;
            }

        }
        return profit;
    }
}