class Solution {
    static boolean canPlace(int[] stalls, int cows, int minDist) {
        int count = 1, last = stalls[0];
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - last >= minDist) {
                count++;
                last = stalls[i];
                if (count == cows) return true;
            }
        }
        return false;
    }

    public int maxDistance(int[] stalls, int cows) {
        Arrays.sort(stalls);
        int lo = 1, hi = stalls[stalls.length - 1] - stalls[0], ans = 0;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (canPlace(stalls, cows, mid)) { ans = mid; lo = mid + 1; }
            else hi = mid - 1;
        }
        return ans;

    }
}