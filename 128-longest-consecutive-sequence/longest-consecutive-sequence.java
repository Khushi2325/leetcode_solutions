class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length ; int max = 0; 
        HashMap<Integer,Integer> map = new HashMap<>() ; 
        for(int num : nums){
            int left = 0 ; int right = 0 ; 
            if(map.containsKey(num)) continue ; 

            if(map.containsKey(num-1)){
                left = map.get(num-1);
            }

            if(map.containsKey(num+1)){
                right = map.get(num+1);
            }

            map.put(num , 1+left+right);
            map.put(num - left, 1+left+right);
            map.put(num + right, 1+left+right);
            max = Math.max(max , map.get(num));
        }
        return max ;
    }
}