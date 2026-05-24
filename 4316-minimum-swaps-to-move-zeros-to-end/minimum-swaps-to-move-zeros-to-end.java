class Solution {
    public int minimumSwaps(int[] nums) {
        int n = nums.length;

        int ans = 0;
        int l = 0;
        int r = n-1;

        while(l <= r){
            if(nums[r] == 0){
                r--;
                continue;
            }

            if(nums[l] == 0){
                nums[l] = nums[r];
                nums[r] = 0;
                r--;
                ans++;
            }

            l++;
        }

        return ans;
    }
}