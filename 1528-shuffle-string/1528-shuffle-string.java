class Solution {
    public String restoreString(String s, int[] indices) {
        char[] text = new char[indices.length]; 
        for (int i=0; i<indices.length; i++) {
            text[indices[i]] = s.charAt(i);
        }
        return new String(text);
    }
}