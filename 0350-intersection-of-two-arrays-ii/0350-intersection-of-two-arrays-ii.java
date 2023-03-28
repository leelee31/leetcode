class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();      
        for (int n : nums1) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n)+1);
            } else {
                map.put(n, 1);
            }
        }
        
        List<Integer> list = new ArrayList<>();
        for (int n : nums2) {
            if (map.containsKey(n) && map.get(n) > 0) {
                map.put(n, map.get(n) - 1);
                list.add(n);
            }
        }
        
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}