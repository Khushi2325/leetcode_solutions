class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int pro = 1;
        int temp = n;
        while(n > 0){
            int ld = n % 10;

            sum += ld;
            pro *= ld;

            n /= 10;
        }

        if(temp % (sum + pro) == 0){
            return true;
        }

        return false;
    }
}