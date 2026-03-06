class Solution {
    public String trimTrailingVowels(String s) {
        int n = s.length();
        int end = -1;

        for(int i = n-1; i>=0;i--){
            if(!isVowel(s.charAt(i))){
                end = i;
                break;
            }
        }

        

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<=end; i++){
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }

    public boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}