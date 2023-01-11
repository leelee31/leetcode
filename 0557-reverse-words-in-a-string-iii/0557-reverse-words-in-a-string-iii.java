class Solution {
    public String reverseWords(String s) {
        String[] strArr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int j=0; j<strArr.length; j++) {
            for (int i=strArr[j].length()-1; i>=0; i--) {
                sb.append(strArr[j].charAt(i));
            }
            if (j != strArr.length-1) sb.append(' ');
        }
        return sb.toString();        
    }
}