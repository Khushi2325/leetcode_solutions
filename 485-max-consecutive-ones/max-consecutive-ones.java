class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;

        int ans = 0, cnt = 0;

        for(int i = 0; i<n; i++){
            if(nums[i] == 1){
                cnt++;
                if(cnt > ans){
                    ans = cnt;
                }
            }else{
                cnt = 0;
            }
        }

        return ans;
    }
}