class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> aList = new ArrayList<>();
        List<Integer> bList = new ArrayList<>();
        Set<Integer> aSet = new HashSet<>();
        Set<Integer> bSet = new HashSet<>();
        for (int n : nums2) {
            bSet.add(n);
        }
        for (int n : nums1) {
            if (aSet.contains(n)) continue;
            aSet.add(n);
            if (!bSet.contains(n)) {
                aList.add(n);
            }
        }
        for (int b : bSet) {
            if (!aSet.contains(b)) {
                bList.add(b);
            }
        }
        answer.add(aList);
        answer.add(bList);
        return answer;
    }
}