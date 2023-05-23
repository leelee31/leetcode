class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums1) {
            if (!set.contains(n)) {
                set.add(n);
            }
        }
        
        List<Integer> list = new ArrayList<>();
        for (int n : nums2) {
            if (set.contains(n)) {
                list.add(n);
                set.remove(n);
            }
        }

        int[] answer = new int[list.size()];
        int i = 0;
        for (int v : list) {
            answer[i++] = v;
        }
        return answer;
    }
}