class Solution {
    public int secondsBetweenTimes(String st, String en) {
        int hr1 = Integer.parseInt(st.substring(0, 2));
        int hr2 = Integer.parseInt(en.substring(0, 2));
        int min1 = Integer.parseInt(st.substring(3, 5));
        int min2 = Integer.parseInt(en.substring(3, 5));
        int sec1 = Integer.parseInt(st.substring(6, 8));
        int sec2 = Integer.parseInt(en.substring(6, 8));

        int t1 = (hr1 * 60 * 60) + (min1 * 60) + (sec1);
        int t2 = (hr2 * 60 * 60) + (min2 * 60) + (sec2);

        return t2 - t1;
    }
}