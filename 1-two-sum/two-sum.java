class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        HashMap<Integer, Integer> mp = new HashMap<>();
        
        for(int i = 0; i<n; i++){
            int b = target - nums[i];

            if(mp.containsKey(b)){
                return new int[]{i, mp.get(b)};
            }
            mp.put(nums[i], i);
        }

        return new int[]{};
    }
}