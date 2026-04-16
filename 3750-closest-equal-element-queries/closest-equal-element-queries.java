import java.util.*;

class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int n = nums.length;
        
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        List<Integer> ans = new ArrayList<>();

        for (int q : queries) {
            int val = nums[q];
            List<Integer> list = map.get(val);

            if (list.size() == 1) {
                ans.add(-1);
                continue;
            }

            int idx = Collections.binarySearch(list, q);

            int res = Integer.MAX_VALUE;

            int prev = list.get((idx - 1 + list.size()) % list.size());
            int dist1 = Math.abs(q - prev);
            res = Math.min(res, Math.min(dist1, n - dist1));

            int next = list.get((idx + 1) % list.size());
            int dist2 = Math.abs(q - next);
            res = Math.min(res, Math.min(dist2, n - dist2));

            ans.add(res);
        }

        return ans;
    }
}