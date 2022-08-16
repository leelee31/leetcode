class Solution {
    Map<String, List<String>> map = new HashMap<String, List<String>>();
    
    public List<String> wordBreak(String s, List<String> wordDict) {
        return wordBreak(s, new HashSet(wordDict));
    }
    
    public List<String> wordBreak(String s, Set<String> wordDict) {
        if (map.containsKey(s))
            return map.get(s);
        
        int len = s.length();
        List<String> ret = new ArrayList<String>();
        
        if (wordDict.contains(s)) {
            ret.add(s);
        }
      
        for (int i=1; i<len; i++){
            String curr = s.substring(i);
            if (wordDict.contains(curr)){
                List<String> strs = wordBreak(s.substring(0,i),wordDict);
                if (strs.size() != 0 ){
                    for (Iterator<String> it = strs.iterator(); it.hasNext();){
                        ret.add(it.next() + " " + curr);
                    }
                }
            }
        }
        
        map.put(s, ret);
        return ret;
    }
}