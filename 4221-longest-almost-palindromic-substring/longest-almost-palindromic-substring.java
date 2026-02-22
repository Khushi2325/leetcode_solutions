class Solution {
    int res = 0;

    public int almostPalindromic(String s) {
        int n = s.length();
        res = 0;

        for (int i = 0; i < 2 * n - 1; i++) {
            int[] lr = expand(s, n, i / 2, (i + 1) / 2);
            int l = lr[0], r = lr[1];
            expand(s, n, l - 1, r);
            expand(s, n, l, r + 1);
        }

        return Math.min(res, n);
    }

    private int[] expand(String s, int n, int l, int r) {
        while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        res = Math.max(res, r - l - 1);
        return new int[]{l, r};
    }
}