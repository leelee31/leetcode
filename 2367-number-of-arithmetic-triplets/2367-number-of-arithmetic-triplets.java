class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> set = new HashSet<>();
        
        for (int n : nums) {
            set.add(n);
        }
        
        int answer = 0;
        for (int i=0; i<nums.length; i++) {
            if (set.contains(nums[i] - diff) && set.contains(nums[i] + diff))
                answer++;
        }
        return answer;
    }
}