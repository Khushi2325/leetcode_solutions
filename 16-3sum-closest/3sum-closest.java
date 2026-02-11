class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int clo = nums[0] + nums[1] + nums[2];

        for(int i =0; i<nums.length - 2; i++){
            int l = i+1;
            int r = nums.length - 1;

            while(l < r){
                int a = nums[i] + nums[l] + nums[r];
                if(Math.abs(clo - target) > Math.abs(a - target)){
                    clo = a;
                }else if(a > target){
                    r--;
                }else{
                    l++;
                }
            }
        }

        return clo;

        
    }
}