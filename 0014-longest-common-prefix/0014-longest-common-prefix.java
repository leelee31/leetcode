class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int len = Math.min(strs[i].length(), prefix.length());
            String tempFix = "";
            for (int j=0; j<len; j++) {
                if (strs[i].charAt(j) == prefix.charAt(j)) {
                    tempFix += prefix.charAt(j);
                } else {
                    break;
                }
            }
            prefix = tempFix;
        }
        return prefix;
    }
}