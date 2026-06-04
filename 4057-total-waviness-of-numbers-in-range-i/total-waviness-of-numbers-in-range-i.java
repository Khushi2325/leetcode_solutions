class Solution {
    public int totalWaviness(int num1, int num2) {
        int tot = 0;

        for(int i = num1; i <= num2; i++){
            tot += wav(i);
        }

        return tot;
    }

    private int wav(int i){
        String s = String.valueOf(i);

        int n = s.length();

        int cnt = 0;

        for(int j = 1; j<n-1; j++){
            int l = s.charAt(j-1) - '0';
            int mid = s.charAt(j) - '0';
            int r = s.charAt(j+1) - '0';

            if(mid > l && mid > r) cnt++;
            else if(mid < l && mid <r)cnt++;
        }

        return cnt;
    }
}