class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) return true;
        boolean[] dp = new boolean[nums.length];
        dp[0] = nums[0] != 0 ? true : false;
        int n = 1;
        for (int i=1; i<nums.length; i++) {
            while (i >= n) {
                if (dp[i-n] && nums[i-n] >= n) {
                    dp[i] = true;
                    break;
                }
                n++;
            }
            n = 1;
        }
        return dp[dp.length-1];
    }
}