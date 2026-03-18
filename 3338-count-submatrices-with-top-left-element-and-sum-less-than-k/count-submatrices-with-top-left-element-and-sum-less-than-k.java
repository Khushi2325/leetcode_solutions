class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;

        int[] cols = new int[m];

        int ans = 0;

        for(int i= 0; i<n; i++){
            int r = 0;

            for(int j = 0; j<m; j++){
                cols[j] += grid[i][j];
                r += cols[j];
                if(r <= k){
                    ans++;
                }
            }
        }

        return ans;
    }
}