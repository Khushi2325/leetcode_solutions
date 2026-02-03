class Solution {
    public int longestCommonSubsequence(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        int[][] dp = new int[n+1][m+1];

        for(int i = 0; i<n+1; i++){
            Arrays.fill(dp[i], -1);
        }

        return memo(str1, str2, n, m, dp);
    }

    public int memo(String str1, String str2, int n, int m, int[][] dp){
        if(n == 0 || m == 0) return 0;

        if(dp[n][m] != -1) return dp[n][m];

        if(str1.charAt(n-1) == str2.charAt(m-1)){
            dp[n][m] = memo(str1, str2, n-1, m-1, dp)+1;
            return dp[n][m];
        }else{
            int ans1 = memo(str1, str2, n-1, m, dp);
            int ans2 = memo(str1, str2, n, m-1, dp);

            return dp[n][m] = Math.max(ans1, ans2);
        }
    }
}