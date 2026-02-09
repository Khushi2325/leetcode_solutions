class Solution {
    public boolean detectCapitalUse(String w) {
        int len = w.length();
        if(len == 1) return true;

        if(Character.isUpperCase(w.charAt(0))){
            int cnt = 1;

            for(int i = 1; i<len; i++){
                if(Character.isUpperCase(w.charAt(i))){
                    cnt++;
                }
            }

            if(cnt == len) return true;
            cnt = 1;

            for(int i = 1; i<len; i++){
                if(Character.isLowerCase(w.charAt(i))){
                    cnt++;
                }
            }

            if(cnt == len) return true;
            else return false;

        }else{
            for(int i = 1; i<len; i++){
                if(Character.isUpperCase(w.charAt(i))){
                    return false;
                }
            }

            return true;
        }

        
    }
}