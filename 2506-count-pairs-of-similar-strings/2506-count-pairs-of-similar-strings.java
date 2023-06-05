class Solution {
    public int similarPairs(String[] words) {
        List<Set<Character>> list = new ArrayList<>();
        for (String w : words) {
            Set<Character> set = new HashSet<>();
            for (int i=0; i<w.length(); i++) {
                set.add(w.charAt(i));
            }
            list.add(set);
        }
        
        int answer = 0;
        for (int i=0; i<list.size()-1; i++) {
            Set<Character> set1 = list.get(i);
            for (int j=i+1; j<list.size(); j++) {
                Set<Character> set2 = list.get(j);
                if (set1.size() == set2.size()) {
                    boolean isSimilar = true;
                    for (char s : set1) {
                        if (!set2.contains(s)) {
                            isSimilar = false;
                            break;
                        }
                    }
                    if (isSimilar)
                        answer++;
                }
            }
        }
        return answer;
    }
}