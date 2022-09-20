class Solution {
    public int convertTime(String current, String correct) {
        String[] cur = current.split(":");
        int curH = Integer.parseInt(cur[0]);
        int curM = Integer.parseInt(cur[1]);
        String[] cor = correct.split(":");
        int corH = Integer.parseInt(cor[0]);
        int corM = Integer.parseInt(cor[1]);
        int gapM = (corH - curH) * 60;
        int gapM2 = corM - curM;
        int gap = gapM + gapM2;
        
        int[] min = {1, 5, 15, 60};
        int[] dp = new int[gap + 1];
        Arrays.fill(dp, 100);
        dp[0] = 0;
        
        for (int m : min) {
            for (int i=1; i <= gap; i++) {
                if (i - m >= 0)
                    dp[i] = Math.min(dp[i], dp[i-m] + 1);
            }    
        }
        
        return dp[gap];
    }
}