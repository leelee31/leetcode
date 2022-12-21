import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        int maxLen = Math.max(a.length(), b.length());
        int[] xrr = new int[maxLen];
        int[] yrr = new int[maxLen];
        
        for (int i=0,len=a.length(); i<len; i++) {
            xrr[i] = a.charAt(len - i - 1) - '0';
        }
        
        for (int i=0,len=b.length(); i<len; i++) {
            yrr[i] = b.charAt(len - i - 1) - '0';
        }
        
        BigInteger sum = new BigInteger("0");
        BigInteger digit = new BigInteger("1");
        int i=0, temp = 0, carry = 0;

        while (i <= maxLen) {
            temp = carry;
            if (i < maxLen)
                temp += xrr[i] + yrr[i];
            if (temp > 1) {
                if (temp > 2) {
                    sum = sum.add(digit.multiply(BigInteger.valueOf(temp - 2)));
                }
                carry = 1;
            } else {
                sum = sum.add(digit.multiply(BigInteger.valueOf(temp)));
                carry = 0;
            }
            digit = digit.multiply(BigInteger.valueOf(10));
            i++;
        }
        
        return sum.toString();
    }
}