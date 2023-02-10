class Solution {
    public boolean isSubsequence(String s, String t) {
        int sIdx = 0;
        int sLen=s.length();
        for (int i=0, len=t.length(); i<len; i++) {
            if (sIdx == sLen) return true;
            if (s.charAt(sIdx) == t.charAt(i)) {
                sIdx++;
            }
        }
        return sIdx == sLen;
    }
}