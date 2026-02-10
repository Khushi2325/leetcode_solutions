class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i<n; i++){
            adj.add(new ArrayList<>());
        }

        for(int e[] : edges){
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }


        return hasPath(adj, source, destination, new boolean[adj.size()]);
    }

    public boolean hasPath(ArrayList<ArrayList<Integer>> adj, int src, int des, boolean[] vis){
        if(src == des) return true;

        vis[src] = true;

        for(int i = 0; i<adj.get(src).size(); i++){
            if(!vis[adj.get(src).get(i)] && hasPath(adj, adj.get(src).get(i), des, vis)){
                return true;
            }
        }


        return false;
    }
}