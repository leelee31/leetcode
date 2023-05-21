class Solution {
    public int subarraySum(int[] nums, int k) {
        int answer = 0;
        for (int i=0; i<nums.length; i++) {
            int tempSum = nums[i];
            if (tempSum == k) {
                answer++;
            }
            for (int j = i+1; j<nums.length; j++) {
                tempSum += nums[j];;
                if(tempSum == k)
                    answer++;
            }
        }
        return answer;
    }
}