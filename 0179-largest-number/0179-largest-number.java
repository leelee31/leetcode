import java.math.BigInteger;

class Solution {
    public String largestNumber(int[] nums) {
        sort(nums, 0, nums.length-1);
        StringBuilder sb = new StringBuilder();
        if (nums[0] == 0)
            sb.append("0");
        else 
            for (int n : nums)
                sb.append(n+"");
        return sb.toString();
    }
    
    public void sort(int[] nums, int start, int end) {
        for (int i=start; i<end; i++) {
            for (int j=i+1; j<end+1; j++) {
                if (findFrontNum(nums[i]) < findFrontNum(nums[j])) {
                    swap(nums, i, j);
                }
                if (findFrontNum(nums[i]) == findFrontNum(nums[j])) {
                    BigInteger n1 = new BigInteger(nums[i] + "" + nums[j]);
                    BigInteger n2 = new BigInteger(nums[j] + "" + nums[i]);
                    if (n1.compareTo(n2) == -1) {
                        swap(nums, i, j);
                    }
                }
            }
        }
    }
    
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public int findFrontNum(int num) {
        if (num < 10) return num;
        int result = num;
        while (result / 10 != 0) {
            result /= 10;
        }
        return result;
    }
}