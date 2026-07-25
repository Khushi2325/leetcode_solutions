class Solution {
    public int maxProduct(int n) {
        int lar = 0;
        int sec = 0;

        while(n > 0){
            int m = n % 10;

            if(m > lar){
                sec = lar;
                lar = m;
            }else if(m > sec){
                sec = m;
            }

            n /= 10;
        }

        return lar * sec;
    }
}