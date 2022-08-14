class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {    
        return wordBreak(s,new HashSet(wordDict));   
    }
    public boolean wordBreak(String s, Set<String> wordDict) {
        boolean[] vis = new boolean[s.length()+1];
        
        vis[0] = true;
        for (int i=1; i<=s.length(); i++) {
            for (int j=0; j<i; j++) {
                String str = s.substring(j, i);
                if (vis[j] && wordDict.contains(str)) {
                    vis[i] = true;
                }
            }
        }
        
        return vis[s.length()];
    }
}