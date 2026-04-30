class Solution {
    public int maxPathScore(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;

        int[][][] dp = new int[m][n][k+1];

        for(int[][] lay : dp){
            for(int[] row : lay){
                Arrays.fill(row , -1);
            }
        }

        dp[0][0][0] = 0;

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                for(int c = 0; c <= k; c++){
                    if(dp[i][j][c] == -1) continue;

                    if(j + 1 < n){
                        int nx = c + (grid[i][j+1] == 0 ? 0 : 1);
                        if(nx <= k){
                            dp[i][j+1][nx] = Math.max(dp[i][j+1][nx], dp[i][j][c] + (grid[i][j+1] == 0 ? 0 : grid[i][j+1]));
                        }
                    }

                    if(i + 1 < m){
                        int nx = c + (grid[i+1][j] == 0 ? 0 : 1);
                        if(nx <= k){
                            dp[i+1][j][nx] = Math.max(dp[i+1][j][nx], dp[i][j][c] + (grid[i+1][j] == 0 ? 0 : grid[i+1][j]));
                        }
                    }
                }
            }
        }

        int max = -1;
        for(int c = 0; c<=k; c++){
            max = Math.max(max, dp[m-1][n-1][c]);
        }

        return max;
    }
}