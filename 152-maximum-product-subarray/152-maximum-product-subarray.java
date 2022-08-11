class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 1) return nums[0];
        
        int max = nums[0], maxPrd = nums[0], minPrd = nums[0];
        
        for (int i=1; i<nums.length; i++) {
            int currMax = maxPrd * nums[i];
            int currMin = minPrd * nums[i];
            maxPrd = Math.max(nums[i], Math.max(currMax, currMin));
            minPrd = Math.min(nums[i], Math.min(currMax, currMin));
            max = Math.max(max, maxPrd);
        }
        
        return max;
    }
}