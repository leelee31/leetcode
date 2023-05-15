class Solution {
    public String mergeAlternately(String word1, String word2) {
        int shortLen = word1.length() < word2.length() ? word1.length() : word2.length();
        String longStr = shortLen == word1.length()? word2 : word1;
        StringBuilder sb = new StringBuilder();
        
       int idx = 0;
        for (int i=0; i<shortLen; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            idx = i;
        }
        
        sb.append(longStr.substring(idx+1, longStr.length()));
        
        return sb.toString();
    }
}