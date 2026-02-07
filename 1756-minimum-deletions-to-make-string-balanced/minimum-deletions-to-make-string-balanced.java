class Solution {
    public int minimumDeletions(String s) {
        int n = s.length();

        Stack<Character> st = new Stack<>();

        int cnt = 0;

        for(int i = 0; i<n; i++){
            if(!st.isEmpty() && st.peek() == 'b' && s.charAt(i) == 'a'){
                st.pop();
                cnt++;
            }else{
                st.push(s.charAt(i));
            }
        }

        return cnt;
    }
}