class Solution {
    public boolean checkRecord(String s) {
        boolean answer = true;
        if (s.indexOf("LLL") != -1)
            answer = false;
        else 
            for (int i=0, aCount=0; i<s.length(); i++) {
                if (s.charAt(i) == 'A')
                    aCount++;
                if (aCount == 2) {
                    answer = false;
                    break;
                }
            }
        return answer;
    }
}