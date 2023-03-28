class Solution {
    public int firstUniqChar(String s) {
        int[] arr = new int[26];
        for (int i=0, len=s.length(); i<len; i++) {
            arr[s.charAt(i) - 'a']++;
        }
        
        int answer = -1;
        for (int i=0, len=s.length(); i<len; i++) {
            if (arr[s.charAt(i) - 'a'] == 1) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}