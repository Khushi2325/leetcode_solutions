class Solution {
    public int countPrimes(int n) {
        if(n <= 1) return 0;

        boolean[] sieve = new boolean[n];

        Arrays.fill(sieve, true);
        sieve[0] = sieve[1] = false;

        for(int i = 2; i*i<=n; i++){
            if(sieve[i]){
                for(int j = i*i; j<n; j+=i){
                    sieve[j] = false;
                }
            }
        }

        int cnt = 0;
        for(int i = 0; i<n; i++){
            if(sieve[i]) cnt++;
        }

        return cnt;
    }
}