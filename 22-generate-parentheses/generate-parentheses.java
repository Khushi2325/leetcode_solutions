class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();

        validParenthesis(list, 0, 0, "", n);
        return list;
    }
    public void validParenthesis(List<String> list, int open, int close, String str, int n){
        if(str.length() == n*2){
            list.add(str);
            return;
        }

        if(open < n){
            validParenthesis(list, open + 1, close, str+"(", n);
        }

        if(close < open){
            validParenthesis(list, open, close+1, str+")", n);
        }
    }
    
}