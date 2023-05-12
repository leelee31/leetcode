class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : arr) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        Set<Integer> set = new HashSet<>();
        boolean answer = true;
        for (int val : map.values()) {
            if (set.contains(val)) {
                answer = false;
                break;
            }
            set.add(val);
        }
        return answer;
    }
}