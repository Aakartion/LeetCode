class Solution {
    public int maxProfit(int[] prices) {
       int buy = prices[0];
        int sell = buy;
        int diff = 0;
        for(int i=0; i<prices.length;i++){
            if(prices[i]<buy){
                buy = prices[i];
                sell = buy;
            }
            if(prices[i]>buy && diff < prices[i] - buy){
                sell = prices[i];
                diff = sell - buy;
            }
            
        }
        return diff; 
    }
}