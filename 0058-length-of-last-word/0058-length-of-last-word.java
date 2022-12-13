class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String answer = s;
        for (int i=s.length()-1; i>=0; i--) {
            if (s.charAt(i) == ' ') {
                answer = s.substring(i+1, s.length());
                return answer.length();
            }
        }
        return answer.length();
    }
}