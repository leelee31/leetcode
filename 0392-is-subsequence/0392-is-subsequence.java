class Solution {
    public boolean isSubsequence(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        if (sLen == 0) return true;
        if (tLen == 0) return false;
        if (sLen > tLen) return false;
        int sIdx = 0;
        for (int i=0; i<tLen; i++) {
            char c = t.charAt(i);
            if (s.charAt(sIdx) == c)
                sIdx++;
            if (sIdx == sLen)
                break;
        }
        return sIdx == sLen ? true : false;
    }
}