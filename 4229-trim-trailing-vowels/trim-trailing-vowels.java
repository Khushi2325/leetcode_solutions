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


        return s.substring(0, end+1);
    }

    public boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}