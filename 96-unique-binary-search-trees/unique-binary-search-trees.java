class Solution {
    public int numTrees(int n) {
        int[] dp = new int[n+1];

        Arrays.fill(dp, -1);

        return cat(dp, n);
    }

    public int cat(int[] dp, int n){
        if(n == 0 || n == 1) return 1;

        if(dp[n] != -1) return dp[n];
        int ans = 0;

        for(int i = 0; i<n; i++){
            ans += cat(dp, i) * cat(dp, n-i-1);
        }

        return dp[n] = ans;
    }
}

