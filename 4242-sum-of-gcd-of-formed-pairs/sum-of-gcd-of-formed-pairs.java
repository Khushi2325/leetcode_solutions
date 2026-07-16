class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] mx = new int[n];
        int pre = Integer.MIN_VALUE;

        for(int i = 0; i<n; i++){
            pre = Math.max(pre, nums[i]);
            mx[i] = pre;
        }

        int[] pregcd = new int[n];
        for(int i = 0; i<n; i++){
            pregcd[i] = gcd(nums[i], mx[i]);
        }

        Arrays.sort(pregcd);

        int l = 0; 
        int r = n-1;
        long ans = 0;

        while(l < r){
            ans += gcd(pregcd[l], pregcd[r]);
            l++;
            r--;
        }

        return ans;

    }

    public int gcd(int a, int b){
        while(b != 0){
            int t = a;
            a = b;
            b = t % a;
        }

        return a;
    }
}