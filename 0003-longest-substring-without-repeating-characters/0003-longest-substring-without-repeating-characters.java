class Solution {
    Set<Character> set;
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if (len <= 1) return len;
        int start = 0, end = 1;
        Set<Character> set = new HashSet<>();
        set.add(s.charAt(start));
        int max = 0;
        while (start < end && end < len) {          
            while(start < end && end < len && !set.contains(s.charAt(end))) {
                set.add(s.charAt(end));
                end++;
            }
            max = Math.max(max, end - start);
            start++;
            end = start + 1;
            set = new HashSet<>();
            set.add(s.charAt(start));
        }
        return max;
    }
}