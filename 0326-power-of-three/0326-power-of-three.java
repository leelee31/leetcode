class Solution {
    public boolean isPowerOfThree(int n) {
        if (n < 1) return false;
        if (n == 1) return true;
        
        int quotient = n;
        int remainder = 0;
        while (quotient > 1) {
            remainder = quotient % 3;
            if (remainder != 0)
                return false;
            quotient = quotient / 3;
        }
        
        return true;
    }
}