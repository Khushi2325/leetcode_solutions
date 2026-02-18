class Solution {
    public int maxArea(int[] ht) {
        int max = 0;
        int l = 0;
        int r = ht.length - 1;

        while(l < r){
            int h = Math.min(ht[l], ht[r]);
            int w = r- l;

            int ar = h * w;
            if(max < ar) max = ar;

            if(ht[l] < ht[r]) l++;
            else r--;
        }
        
        return max;
    }

}