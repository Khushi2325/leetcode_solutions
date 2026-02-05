class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if(len(i) % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public static int len(int n){
        return (int)Math.log10(n) + 1;
    }
}