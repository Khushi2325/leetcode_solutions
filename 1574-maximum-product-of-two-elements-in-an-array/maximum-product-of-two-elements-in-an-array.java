class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;

        for(int i : nums){
            if(i > max){
                sec = max;
                max = i;
            }else if(i > sec){
                sec = i;
            }
        }

        return (max - 1) * (sec-1);
    }
}