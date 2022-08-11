class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) return nums[0];
        int max = nums[0];
        
        for (int i = 1, currMax = nums[0]; i < nums.length; i++) {
            currMax = Math.max(nums[i], currMax + nums[i]);
            max = Math.max(max, currMax);
        }
        
        return max;
    }
}