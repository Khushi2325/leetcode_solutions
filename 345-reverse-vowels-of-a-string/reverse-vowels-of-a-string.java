class Solution {
    public String reverseVowels(String s) {
        int n = s.length();

        int i =0, j = n-1;
        while(i < j){
            if(!isVowel(s.charAt(i))) i++;
            if(!isVowel(s.charAt(j))) j--;

            if(isVowel(s.charAt(i)) && isVowel(s.charAt(j))){
                StringBuilder sb = new StringBuilder(s);
                char t = s.charAt(i);
                sb.setCharAt(i, s.charAt(j));
                sb.setCharAt(j, t);
                s = sb.toString();
                i++;
                j--;
            }
        }

        return s;
    }

    public boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}