class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] arr = new int[10001];
        int max = 0, count = 0;
        
        for (int n : nums1) {
            if (arr[n] == 0)
                arr[n]++;
            if (n > max)
                max = n;
        }
        
        for (int n : nums2) {
            if (arr[n] == 1) {
                arr[n]++;
                count++;
            }
        }
        
        int[] answer = new int[count];
        for (int i=0, idx=0; i<=max; i++) {
            if (arr[i] == 2) {
                answer[idx++] = i;
            }
        }
        
        return answer;
    }
}