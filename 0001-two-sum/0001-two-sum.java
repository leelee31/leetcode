class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] answer = new int[2];
        for (int i=0, temp=0; i<nums.length; i++) {
            temp = target - nums[i];
            if (map.containsKey(temp)) {
                answer[0] = i;
                answer[1] = map.get(temp);
                break;
            }
            map.put(nums[i], i);
        }
        return answer;
    }
}