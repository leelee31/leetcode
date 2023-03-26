class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int n : nums) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }
        
        int result = 0;
        int n = 0;
        for (int key : map.keySet()) {
            n = map.get(key);
            result += (n-1)*n/2;
        }
        
        return result;
    }
}