class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        String s = x + "";
        int sLen = s.length();
        for (int i=0, len=sLen/2; i<len; i++) {
            if (s.charAt(i) != s.charAt(sLen-1-i)) {
                return false;
            }
        }
        return true;
    }
}