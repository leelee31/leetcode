class Solution {
    public int characterReplacement(String s, int k) {
        int uniqueCount = 0;
        int l = 0;
        int max = 0;
        int[] count = new int[26];
        
        for (int r = 0, len = s.length(); r < len; r++) {
            char c = s.charAt(r);
            uniqueCount = Math.max(uniqueCount, ++count[c - 'A']);
            int replaceCount = r - l + 1 - uniqueCount;
            
            if (replaceCount > k) {
                count[s.charAt(l++) - 'A']--;
            } else {
                max = Math.max(max, r - l + 1);
            }
        }
        return max;
    }
}