class Solution {
    public boolean checkDivisibility(int n) {
        int a = n;
        int ds = digisum(a);
        int dp = digipro(a);

        return (n % (ds + dp)) == 0;
    }

    public int digisum(int n){
        int sum = 0;

        while(n > 0){
            sum += n % 10;
            n /=10;
        }

        return sum;
    }

    public int digipro(int n){
        int pro = 1;

        while(n > 0){
            pro *= n % 10;
            n /=10;
        }

        return pro;
    }
}