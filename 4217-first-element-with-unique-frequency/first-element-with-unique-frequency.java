class Solution {
    public int firstUniqueFreq(int[] nums) {
        Map<Integer, Integer> c1 = new HashMap<>();

        for(int i : nums){
            c1.put(i, c1.getOrDefault(i,0)+1);
        }

        Map<Integer, Integer> c2 = new HashMap<>();

        for(int i : c1.values()){
            c2.put(i, c2.getOrDefault(i, 0)+1);
        }

        for(int i : nums){
            if(c2.get(c1.get(i)) == 1)return i;
        }

        return -1;
    }
}