class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length == 1) return;
        int s = nums.length-2, e = nums.length-1, temp = 0, tempS = 0;
        while (s >= 0) {
            if (nums[s] == 0) {
                tempS = s;
                while (tempS <= e-1) {
                    temp = nums[tempS+1];
                    nums[tempS+1] = 0;
                    nums[tempS] = temp;
                    tempS++;
                }
                e--;
            }
            s--;
        }
    }
}