class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) return nums[0];
        int[] dp = new int[nums.length+1];
        dp[0] = nums[0];
        int max = dp[0];
        
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i], dp[i-1] + nums[i]);
            max = Math.max(max, dp[i]);
        }
        
        return max;
    }
}