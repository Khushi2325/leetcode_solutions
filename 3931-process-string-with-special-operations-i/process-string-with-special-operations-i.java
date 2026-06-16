class Solution {
    public String processStr(String s) {
        int n = s.length();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<n; i++){
            if(Character.isLetter(s.charAt(i))){
                sb.append(s.charAt(i));
            }else if(s.charAt(i) == '*'){
                if(sb.length() == 0) continue;
                sb.deleteCharAt(sb.length() - 1);
            }else if(s.charAt(i) == '#'){
                sb.append(sb.toString());
            }else{
                sb.reverse();
            }
        }

        return sb.toString();
    }
}