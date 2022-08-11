class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0, currMinPrice = prices[0]; i < prices.length; i++) {
            currMinPrice = Math.min(currMinPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - currMinPrice);
        }
        return maxProfit;
    }
}