class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        Map<Character, Integer> rMap = new HashMap<>();
        Map<Character, Integer> mMap = new HashMap<>();
        char c = ' ';
        
        for (int i=0; i<ransomNote.length(); i++) {
            c = ransomNote.charAt(i);
            rMap.put(c, rMap.getOrDefault(c, 0) + 1);
        }
        
        for (int i=0; i<magazine.length(); i++) {
            c = magazine.charAt(i);
            mMap.put(c, mMap.getOrDefault(c, 0) + 1);
        }
        
        boolean answer = true;
        for (Character key : rMap.keySet()) {
            if (rMap.get(key) > mMap.getOrDefault(key, 0)) {
                answer = false;
                break;
            }
        }
        
        return answer;
    }
}