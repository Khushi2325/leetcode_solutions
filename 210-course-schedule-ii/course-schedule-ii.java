class Solution {
    public int[] findOrder(int n, int[][] pre) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i<n; i++){
            adj.add(new ArrayList<>());
        }

        for(int i= 0; i<pre.length; i++){
            int v = pre[i][0];
            int u = pre[i][1];

            adj.get(u).add(v);
        }

        boolean[] vis = new boolean[n];
        boolean[] recpath = new boolean[n];

        for(int i = 0; i<n; i++){
            if(!vis[i]){
                if(isCycle(i, vis, recpath, adj)) return new int[]{};
            }
        }

        vis = new boolean[n];
        Stack<Integer> st = new Stack<>();

        for(int i =0; i<n; i++){
            if(!vis[i]){
                topo(i, st, adj, vis);
            }
        }

        int[] ans = new int[n];
        int j = 0;

        while(!st.isEmpty()){
            ans[j++] = st.pop();
        }

        return ans;
    }

    public boolean isCycle(int v, boolean[] vis, boolean[] recpath, ArrayList<ArrayList<Integer>> adj){
        vis[v] = true;
        recpath[v] = true;

        for(int i : adj.get(v)){
            if(!vis[i]){
                if(isCycle(i, vis, recpath, adj)) return true;
            }else if(recpath[i]){
                return true;
            }
        }

        recpath[v] = false;
        return false;
    }

    public void topo(int v, Stack<Integer> st, ArrayList<ArrayList<Integer>> adj, boolean[] vis){
        vis[v] = true;

        for(int i : adj.get(v)){
            if(!vis[i]){
                topo(i, st, adj, vis);
            }
        }

        st.push(v);
    }
}