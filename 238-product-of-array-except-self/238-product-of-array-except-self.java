class Solution {
    int[] dp = new int[100001];
    
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];

        // without using the division operation.
        answer[0] = 1;
        for (int i = 1, left = 1; i < nums.length; i++) {
            left *= nums[i-1];
            answer[i] = left;
        }

        for (int i = nums.length-2, right = 1; i >= 0; i--) {
            right *= nums[i + 1];
            answer[i] *= right;
        }
        
        return answer;
    }

}