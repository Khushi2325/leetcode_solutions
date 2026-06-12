class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();

        if(n != m) return false;

        int[] fre = new int[26];

        for(int i = 0; i<n; i++){
            fre[s.charAt(i) - 'a']++;
        }

        for(int j = 0; j<m; j++){
            fre[t.charAt(j) - 'a']--;
        }

        for(int i = 0; i<26; i++){
            if(fre[i] != 0) return false;
        }

        return true;
    }
}