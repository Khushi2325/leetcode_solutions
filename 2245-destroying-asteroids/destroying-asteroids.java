class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        long m = mass;
        Arrays.sort(asteroids);
        for(int val : asteroids){
            if(m >= val){
             m += val; 
            } else {
                return false;
            }
        }
        return true;
    }
}