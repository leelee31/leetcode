class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int s = 0, e = nums.length-1, i = e; 
        while (s <= e) {
            if (Math.abs(nums[s]) < Math.abs(nums[e])) {
                result[i] = nums[e] * nums[e];
                e--;
            } else {
                result[i] = nums[s] * nums[s];
                s++;
            }
            i--;
        }
        return result;
    }
}