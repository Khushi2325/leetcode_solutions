class Solution {
    public int[] findOrder(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i =0; i<n; i++){
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i<edges.length; i++){
            int v = edges[i][0];
            int u = edges[i][1];

            adj.get(u).add(v); // u -> v
        }

        boolean[] vis = new boolean[n];
        boolean[] recPath = new boolean[n];

        for(int i = 0; i<n; i++){
            if(!vis[i]){
                if(isCycle(i, vis, recPath, adj)){
                    return new int[]{};
                }
            }
        }

        Stack<Integer> st = new Stack<>();
        vis = new boolean[n];
        
        for(int i=0; i<n; i++){
            if(!vis[i]){
                topoSort(i, vis, st, adj);
            }
        }

        int[] ans = new int[n];
        int i = 0;

        while(!st.isEmpty()){
            ans[i++] = st.pop();
        }

        return ans;

    }

    public void topoSort(int s, boolean[] vis, Stack<Integer> st, ArrayList<ArrayList<Integer>> adj){
        vis[s] = true;

        for(int i : adj.get(s)){
            if(!vis[i]){
                topoSort(i, vis, st, adj);
            }
        }

        st.push(s);
    }

    public boolean isCycle(int s, boolean[] vis, boolean[] recPath,                      ArrayList<ArrayList<Integer>> adj){
        vis[s] = true;
        recPath[s] = true;

        for(int i : adj.get(s)){
            if(!vis[i]){
                if(isCycle(i, vis, recPath, adj)){
                    return true;
                }
            }else if(recPath[i]){
                return true;
            }
        }

        recPath[s] = false;
        return false;
    }

}