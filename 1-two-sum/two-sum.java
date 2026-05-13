class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();

        for(int i = 0; ; i++){
            int x = nums[i];
            int y = target - x;
            if(mp.containsKey(y)){
                return new int[]{mp.get(y), i};
            }

            mp.put(x,i);
        }
    }
}