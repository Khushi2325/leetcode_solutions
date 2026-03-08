class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        HashSet<Integer> hs= new HashSet<>();

        for(int i = 0; i<n; i++){
            hs.add(Integer.parseInt(nums[i], 2));
        }

        

        for(int i = 0; i<(1<<n); i++){
            if(!hs.contains(i)){
                String s = Integer.toBinaryString(i);
                while(s.length() < n) s = "0" + s;
                return s;
            }
        }

        return "";
    }
}