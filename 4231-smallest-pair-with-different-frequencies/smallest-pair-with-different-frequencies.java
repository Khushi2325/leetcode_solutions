class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        int[] fre = new int[101];
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i++){
            fre[nums[i]]++;
        }

        int min = nums[0];
        int minfre = fre[min];
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != min && fre[nums[i]] != minfre){
                return new int[]{min, nums[i]};
            }
        }

        return new int[]{-1,-1};


    }
}