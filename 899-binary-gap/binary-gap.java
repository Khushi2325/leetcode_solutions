class Solution {
    public int binaryGap(int n) {
        String bs = Integer.toBinaryString(n);

        int pre = -1;
        int ans = 0;

        for(int i = 0; i<bs.length(); i++){
            if(bs.charAt(i) == '1' && pre == -1){
                pre = i;
            }else if(bs.charAt(i) == '1'){
                ans = Math.max(ans, i-pre);
                pre = i;
            }
        }

        return ans;
    }
}