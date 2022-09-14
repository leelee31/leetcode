class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet();
        String longest = "";
        String temp = "";
        
        for (int i = 0, len = s.length(); i < len; i++) {
            char c = s.charAt(i);
            
            if(set.contains(c)) {
                temp = temp.substring(temp.indexOf(c) + 1, temp.length());
                set.remove(c);
            }
            
            set.add(c);
            temp += c;
            
            if (longest.length() < temp.length()) 
                longest = temp;
        }
        
        return longest.length();
    }
}