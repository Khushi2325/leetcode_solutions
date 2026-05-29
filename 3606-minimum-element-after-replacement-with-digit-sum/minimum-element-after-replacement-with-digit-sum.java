class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>9)min=Math.min(min,replace(nums[i]));
            else min=Math.min(min,nums[i]);
        }
        return min;
    }
    private int replace(int i){
        int ans=0;
        while(i>0){
            ans+=(i%10);
            i/=10;
        }
        return ans;
    }
}