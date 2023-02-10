class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        for (int i=0, len=s.length(); i<len; i++) {
            char first = s.charAt(i);
            char second = t.charAt(i);
            if (map1.containsKey(first)) {
                if (map1.get(first) != second) return false;
            }
            if (map2.containsKey(second)) {
                if (map2.get(second) != first) return false;
            }
            map1.put(first, second);
            map2.put(second, first);
        }
        return true;
    }
}