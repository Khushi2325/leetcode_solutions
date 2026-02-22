class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int n = words.length;
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i<n; i++){
            String a = words[i];
            int sum = 0;

            for(int j = 0; j<a.length(); j++){
                sum += weights[a.charAt(j) - 'a'];
            }
            int val = sum % 26;

            char ch = (char)('z' - val);
            ans.append(ch);
        }

        return ans.toString();
    }
}