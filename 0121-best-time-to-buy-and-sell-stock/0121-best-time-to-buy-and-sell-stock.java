class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, profit = 0;
        for (int price : prices) {
            min = Math.min(min, price);
            max = max > price ? 0 : Math.max(max, price);   
            profit = Math.max(profit, max-min);
        }
        return profit > 0 ? profit : 0;
    }
}