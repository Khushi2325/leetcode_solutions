class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int n = costs.length;
        int cnt = 0;
        Arrays.sort(costs);
        int i = 0;

        // if(costs[i] > coins) return 0;

        while(i<n && coins - costs[i] >=0){
            coins-=costs[i];
            cnt++;
            i++;
        }

        return cnt;
    }
}