class Solution {
    public int mySqrt(int x) {
        if(x == 0)
            return 0;
        if(x == 1)
            return 1;

     // 1 2 3 4 5 6 7 8 9 10
     // l     h           
        int ans = -1;
        int low = 1;
        int high = x;
        while(low <= high) {
            int mid = low + (high -  low) / 2;

            long val = (long) mid * mid ;

            if(val > x) {
                high = mid - 1;
            } else{
                ans = mid;
                low = mid + 1;
            }
        }
        return ans ;

    }
}