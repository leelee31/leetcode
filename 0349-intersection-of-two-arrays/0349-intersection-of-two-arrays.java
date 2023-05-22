class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums1) {
            if (!map.containsKey(n)) {
                map.put(n, 1);
            }
        }
        
        for (int n : nums2) {
            if (map.containsKey(n) && map.get(n) > 0) {
                map.put(n, map.get(n)-1);
            }
        }
        
        Set<Integer> set = new HashSet<>();
        for (int key : map.keySet()) {
            if (map.get(key) == 0) {
                set.add(key);
            }
        }
        int[] answer = new int[set.size()];
        int i = 0;
        for (int s : set) {
            answer[i++] = s;
        }
        
        return answer;
    }
}