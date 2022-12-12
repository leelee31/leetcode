class Solution {
    public int maxArea(int[] height) {
        int temp = 0, max = 0;
        int s=0, e=height.length-1;
        while (s < e) {
            temp = (e - s) * Math.min(height[e], height[s]);
            max = Math.max(max, temp);
            if (height[s] < height[e])
                s++;
            else
                e--;
        }
        return max;
    }
}