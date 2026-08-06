// Last updated: 8/6/2026, 10:27:34 AM
class Solution {
    public int maxProfit(int[] prices) {
        int buy_price = prices[0];
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i] < buy_price){
                buy_price = prices[i];
            }
            else {
                int cur_profit = prices[i] - buy_price;
                profit = Math.max(profit, cur_profit);
            }
        }
        return profit;        
    }
}