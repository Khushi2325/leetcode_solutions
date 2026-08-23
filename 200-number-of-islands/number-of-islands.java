class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int cnt = 0;

        boolean[][] vis = new boolean[n][m];

        for(int i =0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(grid[i][j] == '1'){
                    if(!vis[i][j]){
                        cnt++;
                        dfs(i, j, vis, grid);
                    }
                }
            }
        }

        return cnt;
    }

    public void dfs(int r, int c, boolean[][] vis, char[][] grid){
        vis[r][c] = true;

        int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, 1, 0, -1};

        for (int i = 0; i < 4; i++) {
            int row = r + delRow[i];
            int col = c + delCol[i];

            if (row >= 0 && row < grid.length && 
                col >= 0 && col < grid[0].length && 
                grid[row][col] == '1' && !vis[row][col]) {
                dfs(row, col, vis, grid);
            }
        }
    }
}