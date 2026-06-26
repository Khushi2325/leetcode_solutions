import java.util.*;
class FenwickTree{
    long[] bit;

    FenwickTree(int n){
        bit = new long[n+2];
    }

    void update(int i , int val){
        for(; i<bit.length; i+=i & -i)
            bit[i] += val;
    }

    long query(int i){
        long s = 0;
        for(; i>0; i-=i&-i)
            s+= bit[i];

        return s;
    }
}
class Solution {
    public long countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        long ans = 0;

        int[] pre = new int[n+1];

        pre[0] = 0;
        for(int i = 0; i<n; i++){
            int de = (nums[i] == target) ? 1 : -1;

            pre[i+1] = pre[i] + de;
        }

        int[] sor = pre.clone();
        Arrays.sort(sor);
        Map<Integer, Integer> in = new HashMap<>();
        int idx = 1;
        for(int x : sor){
            if(!in.containsKey(x))
                in.put(x, idx++);
        }

        FenwickTree bit = new FenwickTree(idx + 2);

        for(int i = 0; i<=n; i++){
            int curr = in.get(pre[i]);

            ans += bit.query(curr - 1);
            bit.update(curr, 1);
        }

        return ans;
    }
}