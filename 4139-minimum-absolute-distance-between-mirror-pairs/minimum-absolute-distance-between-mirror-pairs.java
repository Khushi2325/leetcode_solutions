class Solution {
    public int minMirrorPairDistance(int[] nums) {
        int n = nums.length;

        Map<Integer, List<Integer>> mp = new HashMap<>();

        for(int i = 0; i<n; i++){
            mp.computeIfAbsent(nums[i], k->new ArrayList<>()).add(i);
        }

        int ans = Integer.MAX_VALUE;

        for(int i = 0; i<n; i++){
            int r = rev(nums[i]);

            if(!mp.containsKey(r)) continue;

            List<Integer> li = mp.get(r);

            int pos = Collections.binarySearch(li, i);

            if(pos >= 0) pos++;

            else pos = -pos - 1;

            if(pos < li.size()){
                int j = li.get(pos);
                ans = Math.min(ans, j - i);
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    private int rev(int x){
        int r = 0;
        while(x > 0){
            r = r * 10 + (x%10);
            x/=10;
        }

        return r;
    }
}