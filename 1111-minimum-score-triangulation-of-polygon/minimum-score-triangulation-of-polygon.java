class Solution {
    public int minScoreTriangulation(int[] values) {
        int n = values.length;
        int[][] dp = new int[n][n];

        for(int i = 0; i<n; i++){
            Arrays.fill(dp[i], -1);
        }

        return mcm(values, 1, n-1, dp);
    }

    public int mcm(int[] arr, int i, int j, int[][] dp){
        if(i == j) return 0;
        if(dp[i][j] != -1) return dp[i][j];

        int ans = Integer.MAX_VALUE;

        for(int k = i; k<j; k++){
            int c1 = mcm(arr, i, k, dp);
            int c2 = mcm(arr, k+1, j, dp);
            int c3 = arr[i-1] * arr[k] * arr[j];

            ans = Math.min(ans, c1+c2+c3);
        }

        return dp[i][j] = ans;
    }
}