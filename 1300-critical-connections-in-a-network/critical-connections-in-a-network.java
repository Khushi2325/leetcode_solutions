class Solution {
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<List<Integer>> ans = new ArrayList<>(); 
        List<List<Integer>> adj = new ArrayList<>();

        for(int i = 0; i<n; i++){
            adj.add(new ArrayList<>());
        }

        for(int i =0; i<connections.size(); i++){
            int s = connections.get(i).get(0);
            int d = connections.get(i).get(1);

            adj.get(s).add(d);
            adj.get(d).add(s);
        }
        boolean[] vis = new boolean[n];

        int[] dt = new int[n];
        int[] low = new int[n];
        int t=0;

        for(int i =0; i<n; i++){
            if(!vis[i]){
                dfs(i, adj, vis, dt, low, t, ans, -1);
            }
        }

        return ans;
    }

    public static void dfs(int v, List<List<Integer>> connections, boolean[] vis, int[] dt, int[] low, int t, List<List<Integer>> ans, int par){
        vis[v] = true;
        dt[v] = low[v] = ++t;

        for(int a : connections.get(v)){
            if(!vis[a]){
                dfs(a, connections, vis, dt, low, t, ans, v);

                low[v] = Math.min(low[a], low[v]);

                if(low[a] > dt[v]){
                    ans.add(Arrays.asList(a,v));
                }

            }else if(par != a){
                low[v] = Math.min(low[a], low[v]);
            }
        }
    }
}