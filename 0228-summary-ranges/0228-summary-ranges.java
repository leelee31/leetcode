class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> answer = new ArrayList<>();
        if (nums.length == 0) return answer;
        StringBuilder sb = new StringBuilder();
        sb.append(nums[0]+"");
        boolean isContinue = false;
        for(int i=1;i<nums.length;i++) {
            if (nums[i]-nums[i-1] == 1) {
                isContinue = true;
                if (i == nums.length-1) sb.append("->"+nums[i]);
            } else {
                if (isContinue) {
                    sb.append("->"+nums[i-1]);
                }
                answer.add(sb.toString());
                sb.setLength(0);
                sb.append(nums[i]+"");
                isContinue = false;
            }
        }
        if (sb.length() != 0) answer.add(sb.toString());
        return answer;
    }
}