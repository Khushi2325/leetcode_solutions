class Solution {
    public int numberOfSpecialChars(String word) {
        int[] low = new int[26];
        int[] upp = new int[26];

        int n = word.length();
        Arrays.fill(low, -1);
        Arrays.fill(upp, -1);

        for(int i = 0; i<n; i++){
            char c = word.charAt(i);
            if (Character.isLowerCase(c)) {
                low[c - 'a'] = i;
            } else {
                if (upp[c - 'A'] == -1) {
                    upp[c - 'A'] = i;
                }
            }
        }

        int cnt = 0;

        for(int i = 0; i<26; i++){
            if(low[i] != -1  && upp[i] != -1 && low[i] < upp[i]) cnt++;
        }

        return cnt;
    }
}