class Solution {
    public String reverseWords(String s) {
        String[] sArr = s.split(" ");
        int start = 0, end = sArr.length - 1;

        while (start < end) {
            while (start < end && sArr[start].isBlank()) {
                start++;
            }
            while (start < end && sArr[end].isBlank()) {
                end--;
            }
            String temp = sArr[start];
            sArr[start] = sArr[end];
            sArr[end] = temp;
            start++;
            end--;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<sArr.length; i++) {
            if (sArr[i].isBlank()) continue;
            sb.append(sArr[i]);
            if (i != sArr.length - 1)
                sb.append(" ");
        }
        
        return sb.toString();
    }
}