class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        int n = nums.length;
        for(int i = 0; i<n; i++){
            map.computeIfAbsent(nums[i], k-> new ArrayList<>()).add(i);
        }

        int min = Integer.MAX_VALUE;

        for(List<Integer> in : map.values()){
            if(in.size() >= 3){
                for(int i = 0; i+2 < in.size(); i++){
                    int a = in.get(i);
                    int b = in.get(i+2);
                    int c = 2 * (b-a);

                    min = Math.min(min, c);
                }
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}