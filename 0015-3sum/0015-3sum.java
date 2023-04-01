class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        
        Arrays.sort(nums);
        
        for (int i=0; i<nums.length; i++) {
            map.put(nums[i], i);
        }
        
        for (int i=0; i<nums.length-2; i++) {
            for (int j=i+1; j<nums.length-1; j++) {
                int k = (nums[i]+nums[j])*-1;
                if (map.containsKey(k) && map.get(k) > j) {
                    List<Integer> e = new ArrayList<>();
                    e.add(nums[i]);
                    e.add(nums[j]);
                    e.add(k);
                    answer.add(e);
                    j = map.get(nums[j]);
                }
            }
            i = map.get(nums[i]);
        }
        
        return answer;
    }
}