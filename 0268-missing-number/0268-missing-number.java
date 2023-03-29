class Solution {
    public int missingNumber(int[] nums) {
        int[] arr = new int[nums.length+1];
        for (int n : nums) {
            arr[n] = 1;
        }
        
        int ans = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] != 1) {
                ans = i;
                break;
            }
        }
        return ans;
    }
}