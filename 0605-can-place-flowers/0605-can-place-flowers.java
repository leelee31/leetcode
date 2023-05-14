class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length == 1) return flowerbed[0] + n <= 1 ? true : false;
            
        if (n >= 1 && flowerbed[0]==0 && flowerbed[1]==0) { 
            n--;
            flowerbed[0] = 1;
        }
        
        for (int i=1; i<flowerbed.length; i++) {
            if (flowerbed[i] == 1 && flowerbed[i-1] == 1) {
                n++;
                flowerbed[i-1] = 0;
            }
            if (n > 0 && flowerbed[i] == 0 && flowerbed[i-1] == 0) {
                n--;
                flowerbed[i] = 1;
            }
        }
        
        return n == 0 ? true : false;
    }
}