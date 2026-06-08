class Solution {
    public boolean consecutiveSetBits(int n) {
        String bin = Integer.toBinaryString(n);
        int cnt = 0;

        for(int i = 0; i<bin.length()-1; i++){
            if(bin.charAt(i) == '1' && bin.charAt(i+1) == '1'){
                cnt++;
                if(cnt > 1){
                    return false;
                }
            }
        }

        return cnt == 1 ? true : false;
    }
}