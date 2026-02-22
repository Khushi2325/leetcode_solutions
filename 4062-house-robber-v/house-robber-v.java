class Solution {
    public long rob(int[] nums, int[] c) {
        int n = nums.length;
        if(n == 0) return 0;
        if(n == 1) return nums[0];
        long[] dp = new long[n];

        dp[0] = nums[0];

        for(int i= 1; i<n;i++){
            if(c[i] == c[i-1]){
                dp[i] = Math.max(dp[i-1], (i>1 ? dp[i-2] : 0) + nums[i]); 
            }else{
                dp[i] = dp[i-1] +nums[i];
            }
        }

        return dp[n-1];
    }
}