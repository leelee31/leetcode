/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        int mid = 0;
        while (left <= right) {
            mid = left + (right - left)/2;
            if (isBadVersion(mid) && (mid == right || mid == left)) 
                return mid;
            if (!isBadVersion(mid) && isBadVersion(mid+1))
                return mid + 1;
            
            if (isBadVersion(mid))
                right = mid - 1;
            else
                left = mid + 1;
        }
        return n;
    }
}