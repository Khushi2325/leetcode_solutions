import java.util.*;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : prerequisites) {
            int v = edge[0]; 
            int u = edge[1]; 
            adj.get(u).add(v); // u -> v
        }

        boolean[] vis = new boolean[numCourses];
        boolean[] recPath = new boolean[numCourses];

        // 3. Run DFS for each component: O(V + E) total
        for (int i = 0; i < numCourses; i++) {
            if (!vis[i]) {
                if (isCycle(i, vis, recPath, adj)) {
                    return false; // Cycle detected
                }
            }
        }

        return true;
    }

    private boolean isCycle(int src, boolean[] vis, boolean[] recPath, List<List<Integer>> adj) {
        vis[src] = true;
        recPath[src] = true;

        for (int neighbor : adj.get(src)) {
            if (!vis[neighbor]) {
                if (isCycle(neighbor, vis, recPath, adj)) {
                    return true;
                }
            } else if (recPath[neighbor]) {
                return true;
            }
        }

        recPath[src] = false;
        return false;
    }
}