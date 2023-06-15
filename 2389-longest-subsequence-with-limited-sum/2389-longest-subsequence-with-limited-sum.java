class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] answer = new int[queries.length];
        Arrays.sort(nums);
        for (int i=0; i<queries.length; i++) {
            if (nums[0] > queries[i]) continue;
            int s=0, e=0, count=0, sum=0;
            while (s <= e && e < nums.length && nums[e] <= queries[i]) {
                if (nums[e] + sum > queries[i]) {
                    sum = 0;
                    s++;
                    e = s;
                } else if (nums[e] + sum < queries[i]) {
                    count = Math.max(count, e - s + 1);
                    sum += nums[e];
                    e++;
                } else {
                    count = Math.max(count, e - s + 1);
                    sum = 0;
                    s++;
                    e = s;
                }
            }
            answer[i] = count;
        }
        return answer;
    }
}