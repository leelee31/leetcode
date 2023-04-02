class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) return -1;
        int answer = -1;
        int idx = 0;
        for (int i=0, temp=0; i<haystack.length(); i++) {
            temp = i;
            while (idx < needle.length() && i < haystack.length()) {  
                if (haystack.charAt(i) != needle.charAt(idx))
                    break;
                i++;
                idx++;
            }
            if (idx == needle.length()) {
                answer = temp;
                break;
            }
            i = temp;
            idx = 0;
        }
        return answer;
    }
}