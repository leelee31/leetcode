class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                if (map.get(c) == 2) continue;
                map.put(c, map.get(c)+1);
            } else {
                map.put(c, 1);
            }
        }
        
        int answer = -1;
        for (int i=0, len=s.length(); i<len; i++) {
            if (map.get(s.charAt(i)) == 1) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}