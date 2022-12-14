class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 1) return nums[0] >= target ? 0 : 1;
        int s = 0, e = nums.length-1;
        while (s <= e) {
            if (s == e) {
                break;
            }
            int i = (s + e) / 2;
            if (nums[i] == target) return i;
            else if (nums[i] < target)
                s = i + 1;
            else
                e = i - 1;
        }
        return nums[s] < target ? s + 1 : s;
    }
}