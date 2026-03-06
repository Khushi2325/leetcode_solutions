class Solution {
    public String trimTrailingVowels(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();

        for(int i = 0; i<n; i++){
            st.push(s.charAt(i));
        }

        while(!st.isEmpty()){
            if(isVowel(st.peek())){
                st.pop();
            }else{
                break;
            }
        }

        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }

    public boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}