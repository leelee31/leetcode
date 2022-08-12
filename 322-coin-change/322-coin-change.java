class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] cnt = new int[amount+1];
        Arrays.fill(cnt, 10001);
        cnt[0] = 0;
        for (int coin : coins) {
            for (int i=coin; i<=amount; i++) {
                if (cnt[i-coin] != 10001) {
                    cnt[i] = Math.min(cnt[i], cnt[i-coin] + 1);
                }
            }    
        }
        
        return cnt[amount] < 10001 ? cnt[amount] : -1;
    }
}