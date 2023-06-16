class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> answer = new ArrayList<>();
        int underCount = 0, hitCount = 0;
        for (int n : nums) {
            if (n < target) underCount++;
            if (n == target) hitCount++;
        }
        for (int i=underCount, len=underCount+hitCount; i<len; i++) {
            answer.add(i);
        }
        return answer;
    }
}