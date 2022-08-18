class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) return nums[0];
        int max = nums[0];
        
        for (int i = 0, sum = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum < nums[i]) sum = nums[i];
            if (max < sum) max = sum;
        }
        
        return max;
    }
}