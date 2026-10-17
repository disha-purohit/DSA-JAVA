class Solution {
    public int mySqrt(int x) {
        int low = 1 ; 
        int high = x;
        while( low <= high){
            long mid = low + (high - low ) / 2;
            long val = mid * mid;
            if (val > x){
                high = (int)mid - 1;
            }
            else {
                low = (int)mid +1;

            }
        }
      return high;  
    }
}