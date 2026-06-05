class Solution {
    Long dp[][][][][];
    char[] digits;
    public long totalWaviness(long num1, long num2) {
        return solve(num2) - solve(num1 - 1);
    }

    private long solve(long x){
        if(x < 0) return 0;

        digits = String.valueOf(x).toCharArray();
        int n = digits.length;

        dp = new Long[n+1][11][11][20][2];

        return dfs(0, 10, 10, 0, 1);
    }

    private long dfs(int pos, int prev, int curr, int way, int tight){
        if(pos == digits.length) return way;

        if(dp[pos][prev][curr][way][tight] != null){
            return dp[pos][prev][curr][way][tight];
        }

        int li = tight == 1 ? digits[pos] - '0' : 9;

        long ans = 0;

        for(int d = 0; d<=li; d++){
            int nt = (tight == 1 && d==li) ? 1 : 0;

            int nprev = prev;
            int ncurr = curr;
            int nway = way;

            boolean nots = (prev == 10 && curr == 10);

            if(nots && d== 0){
                ans += dfs(pos+1, 10, 10, way, nt);
                continue;
            }

            if(prev == 10){
                ans += dfs(pos+1, curr, d, way,nt);
                continue;
            }

            if(curr ==10){
                ans += dfs(pos+1, prev, d, way, nt);
                continue;
            }

            if(curr > prev && curr > d) nway++;
            else if(curr < prev && curr < d)nway++;

            ans += dfs(pos+1, curr, d, nway, nt);
        }

        return dp[pos][prev][curr][way][tight] = ans;
    }
}