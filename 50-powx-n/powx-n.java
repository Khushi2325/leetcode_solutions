class Solution {
    public double myPow(double x, int n) {

        if(n < 0){
            x = (double)1/x;
            n = Math.abs(n);

        }
        return check(x, n);

    }

    public double check(double x, int n){
         if(n == 0) return (double)1;
        double a = check(x,n/2);

        if(n % 2 == 0){
            return (double)a * a;
        }else{
            return (double)x * a * a;
        }

    }
}