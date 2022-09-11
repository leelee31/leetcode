class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 1) return nums[0];
        int max = nums[0];
        for (int i = 1, curMax = nums[0], curMin = nums[0]; i < nums.length; i++) {
            int tMax = curMax * nums[i];
            int tMin = curMin * nums[i];
            curMax = Math.max(nums[i], Math.max(tMax, tMin));
            curMin = Math.min(nums[i], Math.min(tMax, tMin));
            max = Math.max(max, curMax);
        }
        return max;
    }
}