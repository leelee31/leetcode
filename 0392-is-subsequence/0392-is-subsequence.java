class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        if (s.length() > t.length() || t.length() == 0) return false;
        int sIndex = 0;
        char target = s.charAt(sIndex);
        for (int i=0, len=t.length(); i<len; i++) {
            if (target == t.charAt(i)) {
                if (sIndex == s.length() - 1) return true;
                target = s.charAt(++sIndex);
            }
        }
        return false;
    }
}