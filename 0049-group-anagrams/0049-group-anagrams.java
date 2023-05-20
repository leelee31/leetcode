class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> sMap = new HashMap<>();
        
        
        for (String str : strs) {
            int len = str.length();
            int idx = 0;
            int[] alphabet = new int[26];
            
            while (idx < len) {
                alphabet[str.charAt(idx) - 'a']++;
                idx++;
            }
            
            String salt = "";
            for (int i=0; i<alphabet.length; i++) {
                if (alphabet[i] > 0)
                    salt += (char)(i + 'a') + "" + alphabet[i];
            }
            
            List<String> list = sMap.containsKey(salt) ? sMap.get(salt) : new ArrayList<>();
            list.add(str);
            sMap.put(salt, list);
        }

        List<List<String>> answer = new ArrayList<>();
        for (List<String> list : sMap.values()) {
            answer.add(list);
        }
        
        return answer;
    }
}