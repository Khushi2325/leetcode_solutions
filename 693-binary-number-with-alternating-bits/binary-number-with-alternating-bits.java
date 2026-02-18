class Solution {
    public boolean hasAlternatingBits(int n) {
        String bs = Integer.toBinaryString(n);
        for(int i=1 ; i<bs.length() ; i++){
            if(bs.charAt(i) == bs.charAt(i-1)) return false ;
        }
    return true ;
    }
}