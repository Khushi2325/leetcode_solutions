class Solution {
    public boolean canFinish(int n, int[][] pre) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i<n; i++){
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i<pre.length; i++){
            int u = pre[i][0];
            int v = pre[i][1];

            adj.get(u).add(v);
        }

        boolean[] vis = new boolean[n];
        boolean[] recpath = new boolean[n];

        for(int i = 0; i<n; i++){
            if(!vis[i]){
                if(dfs(i, vis, adj, recpath)) return false;
            }
        }

        return true;
    }

    public boolean dfs(int v, boolean[] vis, ArrayList<ArrayList<Integer>> adj, boolean[] recpath){

        vis[v] = true;
        recpath[v] = true;

        for(int i : adj.get(v)){
            if(!vis[i]){
                if(dfs(i, vis, adj, recpath)) return true;
            }else if(recpath[i]){
                return true;
            }
        }

        recpath[v] = false;
        return false;
    }
}