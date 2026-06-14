class Solution {
    public boolean checkGoodInteger(int n) {
        int ds = 0;
        int ss  = 0;

        while(n > 0){
            int ld = n  % 10;
            ds += ld;
            ss += (ld * ld);
            n /= 10;
        }

        return ((ss - ds) >= 50);
    }
}