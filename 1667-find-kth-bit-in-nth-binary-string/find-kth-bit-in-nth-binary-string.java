class Solution {
    public String invert(String s){
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<n; i++){
            if(s.charAt(i) == '1'){
                sb.append('0');
            }else{
                sb.append('1');
            }
        }

        return sb.toString();
    }

    public String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }

    public char findKthBit(int n, int k) {
        String s = "0";

        if(n == 1 && k == 1) return '0';


        for(int i = 2; i<=n; i++){
            StringBuilder sb = new StringBuilder();
            String a = reverse(invert(s));
            sb.append(s).append('1').append(a);
            s = sb.toString();
        }  

        return s.charAt(k-1);
    }
}