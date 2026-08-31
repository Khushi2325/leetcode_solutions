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
        boolean[] recPath = new boolean[n];

        for(int i = 0; i<n; i++){
            if(!vis[i]){
                if(topo(i, adj, vis, recPath)){
                    return false;
                }
            }
        }

        return true;
    }

    public boolean topo(int v, ArrayList<ArrayList<Integer>> adj, boolean[] vis, boolean[]recPath){
        vis[v] = true;
        recPath[v] = true;

        for(int i : adj.get(v)){
            if(!vis[i]){
                if(topo(i, adj, vis, recPath)){
                    return true;
                }
            }else if(recPath[i]){
                return true;
            }
        }

        recPath[v] = false;
        return false;
    }
}