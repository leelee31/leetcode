class Solution {
    public String reverseVowels(String s) {
        List<Character> list = new ArrayList<>();
        char[] cArr = s.toCharArray();
        for (int i=0; i<cArr.length; i++) {
            if (cArr[i] == 'a' || cArr[i] == 'e'  || cArr[i] == 'i' 
                || cArr[i] == 'o'  || cArr[i] == 'u' 
                || cArr[i] == 'A' || cArr[i] == 'E'  || cArr[i] == 'I' 
                || cArr[i] == 'O'  || cArr[i] == 'U') {
                list.add(cArr[i]);
                cArr[i] = '*';
            }
        }
        
        StringBuilder sb = new StringBuilder();
        int idx = list.size() -1;
        for (char c : cArr) {
            if (c == '*') {
                sb.append(list.get(idx--));
            } else {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}