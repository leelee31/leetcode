public class Solution {
    public String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0) 
            return "";
        
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strs, (s1, s2) -> (s2+s1).compareTo(s1+s2));
        
        if (strs[0].charAt(0) == '0') 
            return "0";
        
        StringBuilder answer = new StringBuilder();
        for (String s : strs) {
            answer.append(s);
        }
        return answer.toString();
    }
}