class Solution {
    public class Node{
        int r;
        int c;
        int t;

        Node(int r, int c, int t){
            this.r = r;
            this.c = c;
            this.t = t;
        }
    }
    public int orangesRotting(int[][] grid) {
        Queue<Node> q = new LinkedList<>();

        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[0].length; j++){
                if(grid[i][j] == 2){
                    q.add(new Node(i, j, 0));
                }
            }
        }

        int ans = 0;
        boolean[][] vis = new boolean[grid.length][grid[0].length];

        while(!q.isEmpty()){
            Node cur = q.remove();

            int i = cur.r;
            int j = cur.c;
            int t = cur.t;

            ans = Math.max(t, ans);

            
            ///top(i-1, j)
            if(i-1 >= 0 && grid[i-1][j] == 1 && !vis[i-1][j]){
                vis[i-1][j] = true;
                q.add(new Node(i-1, j, t+1));
            }

            if(i+1 < grid.length && grid[i+1][j] == 1 && !vis[i+1][j]){
                vis[i+1][j] = true;
                q.add(new Node(i+1, j, t+1));
            }

            if(j-1 >= 0 && grid[i][j-1] == 1 && !vis[i][j-1]){
                vis[i][j-1] = true;
                q.add(new Node(i, j-1, t+1));
            }

            if(j+1 < grid[0].length && grid[i][j+1] == 1 && !vis[i][j+1]){
                vis[i][j+1] = true;
                q.add(new Node(i, j+1, t+1));
            }
        }

        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[0].length; j++){
                if(!vis[i][j] && grid[i][j] == 1){
                    return -1;
                }
            }
        }

        return ans;
    }
}