class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i=1, s=0; i<prices.length; i++) {
            if (prices[s] > prices[i])
                s = i;
            max = Math.max(max, prices[i] - prices[s]);
        }
        return max < 0 ? 0 : max;
    }
}