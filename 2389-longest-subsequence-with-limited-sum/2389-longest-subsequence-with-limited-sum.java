class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] answer = new int[queries.length];
        Arrays.sort(nums);
        for (int i=1; i<nums.length; i++) {
            nums[i] += nums[i-1];
        }
        for (int i=0; i<queries.length; i++) {
            answer[i] = binarysearch(nums, queries[i]);
        }
        return answer;
    }
    
    private int binarysearch(int nums[], int target){
        int s=0, e=nums.length-1, len = 0;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(nums[mid] <= target) {
                len = mid + 1;
                s = len;
            } else {
                e = mid - 1;
            }
        }
        return len;
    }
}