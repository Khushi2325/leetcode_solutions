class Solution {
    public String reverseWords(String s) {
        String[] a = s.trim().split("\\s+");

        String o = "";

        for(int i  = a.length-1; i>0; i--){
            o += a[i] + " ";
        }

        return o + a[0];
    }
}