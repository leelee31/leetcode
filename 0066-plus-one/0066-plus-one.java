class Solution {
    public int[] plusOne(int[] digits) {
        return checkDigits(digits, digits.length-1);
    }
    
    public int[] checkDigits(int[] digits, int cursor) {
        if (digits[cursor] != 9) {
            digits[cursor]++;
            return digits;
        }
        
        if(cursor != 0){
            digits[cursor] = 0;
            return checkDigits(digits, --cursor);
        }
        
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}