class Solution {
    public class Node{
        int row;
        int col;
        int time;

        Node(int a, int b, int c){
            this.row = a;
            this.col = b;
            this.time = c;
        }
    }
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int ans = 0;
        boolean[][] vis = new boolean[n][m];

        Queue<Node> q = new LinkedList<>();

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(grid[i][j] == 2){
                    q.add(new Node(i,j,0));
                }
            }
        }

        while(!q.isEmpty()){
            Node curr = q.remove();

            int i = curr.row;
            int j = curr.col;
            int t = curr.time;

            ans = Math.max(ans, t);

            //top
            if(i-1 >= 0 && grid[i-1][j] == 1 && !vis[i-1][j]){
                q.add(new Node(i-1, j, t+1));
                vis[i-1][j] = true;
            }

            //left
            if(j-1 >= 0 && grid[i][j-1] == 1 && !vis[i][j-1]){
                q.add(new Node(i, j-1, t+1));
                vis[i][j-1] = true;
            }

            //right
            if(j+1 < m && grid[i][j+1] == 1 && !vis[i][j+1]){
                q.add(new Node(i, j+1, t+1));
                vis[i][j+1] = true;
            }

            //bottom
            if(i+1 < n && grid[i+1][j] == 1 && !vis[i+1][j]){
                q.add(new Node(i+1, j, t+1));
                vis[i+1][j] = true;
            }
        }

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(grid[i][j] == 1 && !vis[i][j]){
                    return -1;
                }
            }
        }

        return ans;
    }
}