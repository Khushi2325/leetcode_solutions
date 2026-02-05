class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 0;

        int i = 0;

        for(int n : nums){
            if(cnt == 0){
                i = n;
            }

            if(n == i){
                cnt++;
            }else{
                cnt--;
            }
        }

        return i;
    }
}